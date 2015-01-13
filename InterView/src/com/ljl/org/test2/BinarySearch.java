package com.ljl.org.test2;
/**
 *@DEMO:Interview
 *@Author:jilongliang
 *@Date:2013-3-20
 */
/**
 * 二分查找又称折半查找，它是一种效率较高的查找方法。 
　　【二分查找要求】：1.必须采用顺序存储结构 2.必须按关键字大小有序排列。
 * @author Administrator
 *
 */
public class BinarySearch { 
	public static void main(String[] args) {
		int[] src = new int[] {1, 3, 5, 7, 8, 9}; 
		System.out.println(binarySearch(src, 3));
		System.out.println(binarySearch(src,3,0,src.length-1));
	}

	/**
	 * * 二分查找算法 * *
	 * 
	 * @param srcArray
	 *            有序数组 *
	 * @param des
	 *            查找元素 *
	 * @return des的数组下标，没找到返回-1
	 */ 
   public static int binarySearch(int[] srcArray, int des){ 
	
		int low = 0; 
		int high = srcArray.length-1; 
		while(low <= high) { 
			int middle = (low + high)/2; 
			if(des == srcArray[middle]) { 
			    return middle; 
			}else if(des <srcArray[middle]) { 
			    high = middle - 1; 
			}else { 
			    low = middle + 1; 
			}
		}
		return -1;
   }
      
	  /**  
	 *二分查找特定整数在整型数组中的位置(递归)  
	 *@paramdataset  
	 *@paramdata  
	 *@parambeginIndex  
	 *@paramendIndex  
	 *@returnindex  
	 */
	public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){  
	   int midIndex = (beginIndex+endIndex)/2;  
	   if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
		   return -1;  
	   }
	   if(data <dataset[midIndex]){  
		   return binarySearch(dataset,data,beginIndex,midIndex-1);  
	   }else if(data>dataset[midIndex]){  
	       return binarySearch(dataset,data,midIndex+1,endIndex);  
	   }else {  
		   return midIndex;  
	   }  
   } 

}