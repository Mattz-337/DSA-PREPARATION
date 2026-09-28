#include <stdio.h>

int main(){
    int arr[10] = {10, 20, 30, 40, 50};
    int n = 5;
    int pos,val;

    printf("position: ");
    scanf("%d",&pos);
    printf("value: ");
    scanf("%d",&val);

    for(int i=n;i>pos;i--){
        arr[i]=arr[i-1];
    }
    arr[pos]=val;
    n++;

    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }

    return 0;
}





