package twitter;

public class Triangle {
	private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calculationOfPerimeter() {
        System.out.println(Math.sqrt(Math.pow(this.width / 2, 2) + Math.pow(this.height, 2)));
    }

    public void printTriangle() {
        if (this.width % 2 == 0 || this.width > this.height * 2) {
            System.out.println("Cannot print the triangle.");
        } else {
        	  int OddAmount, middle, timesPerBlock, secondBlock;
              int[] spacesArray = new int[this.height];
              int[] starsArray = new int[this.height];

              OddAmount = (this.width - 3) / 2;
              middle = this.height - 2;
              timesPerBlock = middle / OddAmount;
              secondBlock = (middle % OddAmount) + timesPerBlock;

              String currentLine = "";

              starsArray[0] = 1;
              starsArray[starsArray.length - 1] = width;

              for (int i = 1; i < secondBlock + 1; i++)
            	  starsArray[i] = 3;
              for (int i = secondBlock + 1; i < starsArray.length - 1; i++)
                  for (int j = 0; j < timesPerBlock; j++)
                  {
                      if (j == 0)
                    	  starsArray[i] = starsArray[i - 1] + 2;
                      else
                    	  starsArray[i] = starsArray[i - 1];
                      if (j < timesPerBlock - 1)
                          i++;
                  }
              for (int i = 0; i < spacesArray.length; i++)
            	  spacesArray[i] = (this.width - starsArray[i]) / 2;
              for (int i = 0; i < height; i++)
              {
                  currentLine = "";
                  for (int j = 0; j < spacesArray[i]; j++)
                      currentLine += " ";
                  for (int j = 0; j < starsArray[i]; j++)
                      currentLine += "*";
                  System.out.println(currentLine);
        }
    }
    }}
