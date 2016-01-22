

class Algorithms {

	public static void main(String[] args) {
		int[] cards = {7, 3, 11, 9, 2, 9, 2, 1};
		int[] sorted = sort(cards);
		String str = "";
		for (int j = 0; j < sorted.length; j ++) {
			str += sorted[j] + ", ";
			
		}

		System.out.println(str);
		System.out.println(present(sorted, 17));

	}

	public static int max(int[] a) {
		
		int max = 0;

		for (int j=0; j < a.length; j ++) {
			if (a[j] > max) {
				max = a[j];
			}
		}
		return max;
	}

	public static int[] sort(int[] a) {
		
		int[] sorted = a;
		int temp = 0;

		for (int j = 0; j < sorted.length; j ++) {
			for (int l = j + 1; l < sorted.length; l ++) {
				if (sorted[l] > sorted[j]) {
					temp = sorted[j];
					sorted[j] = sorted[l];
					sorted[l] = temp;
				}
			}

			}
		return sorted;
		}

		public static boolean present(int[] a, int b) {
			boolean present = false;
			int temp = 0;
			// System.out.println(a.length);
			if (a.length % 2 == 0) {
				// System.out.println("If is running");
				for (int j = 0; j < a.length; j += 2) {
					// System.out.println(a[j]);
					if (a[j] <= b) {
						if (a[j] == b) {
							return present = true;
						} else if (a[j-1] == b){
							return present = true;
						}
					// temp = j;
					// break;
				}
			}
			System.out.println(temp);
				// for (int k = temp + 1; k < a.length; k -= 1) {
				// 	// System.out.println("Spot:" + a[k]);
				// 	// System.out.println(b);
				// 	if (a[k] == b) {
				// 		 return present  = true;
				// 	}
			// }
		} else {
			for (int j = 0; j < a.length; j ++) {
				if (a[j] == b) {
					return present = true;
				}
			}
		}
			return present;
		}
	}

