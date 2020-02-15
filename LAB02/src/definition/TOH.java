package definition;

public class TOH {
    public void TowerOfHanoi(int n , String src , String aux , String dest)
    {
        // if only one disk i.e our base condition
        if(n==1)
        {
            System.out.println(src+"-->"+dest);
            return;
        }
        // move top n-1 disk using from a to b using c as a auxiliary
        TowerOfHanoi(n-1,src,dest,aux);

        // move the remaining 1 disk from a to c
        System.out.println(src+"-->"+dest);

        // now to move that n-1 disk from b to c using a as an auxiliary
        TowerOfHanoi(n-1,aux,src,dest);

    }
}
