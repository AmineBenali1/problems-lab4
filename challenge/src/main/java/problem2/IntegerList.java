package problem2;

public class IntegerList
{
    int currNumInt;
    int currSizeArr;

    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currSizeArr = size;
        currNumInt = 0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
            currNumInt++;
        }
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        // changed the condition of the loop to stop just in the current number of integers not the whole list
        for (int i=0; i < currNumInt; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        // create a new list with doubled size and copy elements to it
        int[] list2 = new int[currSizeArr*2];
        for(int i=0; i< currSizeArr; i++){
            list2[i] = list[i];
        }
        list = list2;
        currSizeArr *= 2;
    }
    public void addElement(int newVal){
        // if the array is full, double its size then add the value and increment the count
        if(currNumInt == currSizeArr) increaseSize();
        list[currNumInt] = newVal;
        currNumInt++;
    }
    public void removeAll(int val){
        int[] list2 = new int[currSizeArr];
        int i2 = 0;
        for(int i=0; i< currSizeArr; i++){
            // if it's not an occurence add it to the new list and increment the index of addition
            if(list[i] != val){
                list2[i2] = list[i];
                i2++;
            }
            else{
                // each time we found an occurence, we won't include it in the new list
                // that means that the number of integers will decrease by 1 each time
                currNumInt--;
            }
        }
        list = list2;
    }
}