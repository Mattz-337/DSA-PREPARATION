#include <stdio.h>

int main(){
    int n;
    printf("Enter size: ");
    scanf("%d",&n);

    int arr[n];
    for(int i=0;i<n;i++){
        printf("arr[%d]: ",i);
        scanf("%d",&arr[i]);
    }
    printf("array: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}