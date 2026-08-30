#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *p = malloc(3 * sizeof(int));

    if(p == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Initial 3 elements
    for(int i = 0; i < 3; i++)
    {
        p[i] = (i + 1) * 10;
    }

    printf("Initial array:\n");

    for(int i = 0; i < 3; i++)
    {
        printf("%d\n", p[i]);
    }

    // Number of additional elements
    int n;

    printf("How many more elements? ");
    scanf("%d", &n);

    // Resize: original 3 + new n
    int *temp = realloc(p, (n + 3) * sizeof(int));

    if(temp == NULL)
    {
        printf("Reallocation failed\n");
        free(p);
        return 1;
    }

    p = temp;

    // Add new elements
    for(int i = 3; i < n + 3; i++)
    {
        p[i] = (i + 1) * 10;
    }

    printf("Final array:\n");

    for(int i = 0; i < n + 3; i++)
    {
        printf("%d\n", p[i]);
    }

    free(p);

    return 0;
}