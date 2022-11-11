#include<iostream>
using namespace std;
int main()
{
    cout<<"Enter the size of the array :\n";
    int size,i;
    cin>>size;
    int arr[size];
    cout<<"Enter the elements in the array :\n";
    for(i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    for (i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }
    cout<<"The sorted array is :\n";
    for(i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    int st=0,end=size-1,mid;
    cout<<"\nEnter the element to be searched for :\n";
    int ele;
    cin>>ele;
      while ( st <= end)
    {
        mid = ( st + end ) / 2;
        if (arr[mid] == ele)
        {
            cout << " Element is found at index " << (mid + 1);
            exit (0);
        }
        else if ( ele > arr[mid])
        {
            st = mid + 1;
        }
        else if ( ele < arr[mid])
        {
            end = mid - 1;
        }
    }
    cout<<ele<<" is not present in the array.";
    return 0;
}
