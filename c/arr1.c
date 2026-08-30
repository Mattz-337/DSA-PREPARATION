#include <stdio.h>

int main(){
    int arr[5] = {10, 20, 30, 40, 50};

    for(int i=0;i<5;i++){
        printf("%d",arr[i]);
    }
    printf("%d",arr[1]);
    printf("%d",arr[4]);
    printf("%d",arr[2]);
    return 0;
}



// #include <stdio.h>

// int main()
// {
//     int arr[5] = {10, 20, 30, 40, 50};

//     printf("Address of arr[0]: %p\n", (void *)&arr[0]);
//     printf("Address of arr[1]: %p\n", (void *)&arr[1]);
//     printf("Address of arr[2]: %p\n", (void *)&arr[2]);

//     printf("Value using arr[0]: %d\n", arr[0]);
//     printf("Value using *(arr+0): %d\n", *(arr + 0));

//     printf("Value using arr[2]: %d\n", arr[2]);
//     printf("Value using *(arr+2): %d\n", *(arr + 2));

//     return 0;
// }