public class SurveyCount{
  public static void main(String[] args){
    int[] Survey = {5, 4, 5, 2, 3, 1, 4, 5, 1, 4, 3, 3, 5, 3, 4, 1, 5, 5, 3, 2};
    int[] frequency = new int[5];
    
    for(int n = 1; n <= Survey.length; n++){
      int score = Survey[n-1];
      switch(score){
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
      }
    }
    
  System.out.printf("%10s | %10s | %10s%n", "Rating", "Count", "Stars");
    
  for(int i = 1; i <= 5; i++){
    String stars = " ";
    for(int j = 0; j < frequency[i-1]; j++){
      stars += "*";
    }
    System.out.printf("%10d | %10d | %10s%n", i, frequency[i-1], stars);
    }
  }
}
