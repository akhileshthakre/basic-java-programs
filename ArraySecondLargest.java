class ArraySecondLargest {
	public static void main(String[] args) {
		int[] arr = {20,10,30,40,50};
		int max = arr[0];
		int secondMax = 0;
		int temp = 0;

		for (int i = 0;i<arr.length ;i++ ) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int j = 0;j<arr.length;j++ ) {
			System.out.println(arr[j]);
		}

		System.out.println("Second Larget value is");
		System.out.print(arr[arr.length-2]);
		
		//System.out.println();
	}
}