import java.security.SecureRandom;

public class DiceFaceCount {
  public static void main(String[] args){
    SecureRandom rand = new SecureRandom();
    int[] frequency = new int[6];

  for(int i = 1; i <= 2000000; i++){
    int face = rand.nextInt(6) + 1;

    switch(face){
      case 1:
        ++frequency[0];
        break;
      case 2:
        ++frequency[1];
        break;
      case 3:
        ++frequency[2];
        break;
      case 4:
        ++frequency[3];
        break;
      case 5:
        ++frequency[4];
        break;
      case 6:
        ++frequency[5];
        break;
    }
  }
  for(int n = 1; n <= 6; n++){
    System.out.printf("Face %d: %d%n", n, frequency[n-1]);
      }
  }
}
  
