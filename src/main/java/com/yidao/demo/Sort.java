package com.yidao.demo;

import java.util.Arrays;

/**
 * @author huyan@yjx.org.cn
 * @date 2021/1/30 16:34
 */
public class Sort {
    public void  maopaosort(int[] a) {
        // TODO Auto-generated method stub
        for(int i=a.length-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int team=a[j];
                    a[j]=a[j+1];
                    a[j+1]=team;
                }
            }
        }
    }

    public void quicksort(int [] a,int left,int right)
    {
        int low=left;
        int high=right;
        //下面两句的顺序一定不能混，否则会产生数组越界！！！very important！！！
        //作为判断是否截止条件
        if(low>high) {
            return;
        }
        //额外空间k，取最左侧的一个作为衡量，最后要求左侧都比它小，右侧都比它大。
        int k=a[low];
        //这一轮要求把左侧小于a[low],右侧大于a[low]。
        while(low<high)
        {
            //右侧找到第一个小于k的停止
            while(low<high&&a[high]>=k)
            {
                high--;
            }
            //这样就找到第一个比它小的了
            //放到low位置
            a[low]=a[high];
            //在low往右找到第一个大于k的，放到右侧a[high]位置
            while(low<high&&a[low]<=k)
            {
                low++;
            }
            a[high]=a[low];
        }
        //赋值然后左右递归分治求之
        a[low]=k;
        quicksort(a, left, low-1);
        quicksort(a, low+1, right);
    }

    public void insertsort (int a[])
    {
        int team=0;
        for(int i=1;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a));
            team=a[i];
            for(int j=i-1;j>=0;j--)
            {

                if(a[j]>team)
                {
                    a[j+1]=a[j];
                    a[j]=team;
                }
                else {
                    break;
                }
            }
        }
    }

    public void shellsort (int a[])
    {
        int d=a.length;
        int team=0;
        //共分成d组
        for(;d>=1;d/=2)
            //到那个元素就看这个元素在的那个组即可
        {
            for(int i=d;i<a.length;i++)
            {
                team=a[i];
                for(int j=i-d;j>=0;j-=d)
                {
                    if(a[j]>team)
                    {
                        a[j+d]=a[j];
                        a[j]=team;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }

    private static void mergesort(int[] array, int left, int right) {
        int mid=(left+right)/2;
        if(left<right)
        {
            mergesort(array, left, mid);
            mergesort(array, mid+1, right);
            merge(array, left,mid, right);
        }
    }

    private static void merge(int[] array, int l, int mid, int r) {
        int lindex=l;int rindex=mid+1;
        int team[]=new int[r-l+1];
        int teamindex=0;
        while (lindex<=mid&&rindex<=r) {//先左右比较合并
            if(array[lindex]<=array[rindex])
            {
                team[teamindex++]=array[lindex++];
            }
            else {
                team[teamindex++]=array[rindex++];
            }
        }
        while(lindex<=mid)//当一个越界后剩余按序列添加即可
        {
            team[teamindex++]=array[lindex++];

        }
        while(rindex<=r)
        {
            team[teamindex++]=array[rindex++];
        }
        for(int i=0;i<teamindex;i++)
        {
            array[l+i]=team[i];
        }

    }
}
