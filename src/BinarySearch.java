
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]={6,1,2,3,4,5,9,10};
		int low=0,high=arr.length;
	    int	mid=(low+high)/2;
		int key=2;
		while (low<=high) {
			
			if(arr[mid]<key) {
				low = mid+1;
			}else if(arr[mid]==key) {
				mid=key;
				break;
			}
			System.out.println("At Index: "+mid);
			break;
			}
		    if (low >= high) {
			System.out.println("Element is not found.......");
		}
	}
}
