package Secret;

public class TowerHanoi {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n,'a','b','c');
    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
{ 
if (n == 0) { 
return; 
} 
towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); 
System.out.println("Moving ring " + n + " from  "
  + from_rod +" to "+ to_rod); 
towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); 
} 

}