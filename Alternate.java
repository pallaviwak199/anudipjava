package Document;

public class Alternate {

	 // Alternatively add elements in third array 

    // add remaning element

    static void alternateMerge(int a1[], int a2[],  int n1, int n2, int a3[])

    {
        int i = 0, j = 0, k=0;
        while (i < n1 && j < n2)
        {
            a3[k++] = a1[i++];//a3[0]=a1[0]  a3[2]=a1[1]  a3[4]=a1[2]  a3[6]=a1[3]  a3[8]=a1[4]
            a3[k++] = a2[j++];//a3[1]=a2[0]  a3[3]=a1[1]  a3[5]=a1[2]  a3[7]=a1[3]  a3[9]=a1[4]
        }
     // adding remaining elements of a1
        while (i < n1)
            a3[k++] = a1[i++];
        // adding remaining elements of a2
        while (j < n2)
            a3[k++] = a2[j++];
    }
}