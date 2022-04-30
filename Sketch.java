import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
  * Description: Using various input capabilities
  * Author: Brady So
  */

  // Tree variables
  float treeBushX1 = 50;
  float treeTrunkX1 = 25;
  float treeBushX2 = 510;
  float treeTrunkX2 = 485;
  
  // KeyPressed Buttons
  boolean leftPressed = false;
  boolean rightPressed = false;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // Changing sky/background color and adding grass
    if(keyPressed){
      // drawing grass
      fill(0, 204, 0); 
      grass(0, 280, 600, 500);
      if(key == '1'){
        background(0, 0, 153);// dark blue
      }else if(key == '2'){
        background(51, 51, 51); // grey
      }else{
        background(51, 204, 255); // back to default sky blue
      }
    }
    // Drawing clouds
    if(mousePressed){
      fill(153, 153, 153);
      clouds(35, 25, 200, 50);
      clouds(175, 25, 200, 50);
      clouds(350, 25, 200, 50);
      clouds(490, 25, 200, 50);
    }else{
      fill(255, 255, 255);
      clouds(35, 25, 200, 50);
      clouds(175, 25, 200, 50);
      clouds(350, 25, 200, 50);
      clouds(490, 25, 200, 50);
    }
    // right key will move tree x1 right and tree x2 left
    if(rightPressed == true){
      treeBushX1++;
      treeTrunkX1++;
      treeBushX2--;
      treeTrunkX2--;
    }
    // left key will move tree x1 left and tree x2 right
    if(leftPressed == true){
      treeBushX1--;
      treeTrunkX1--;
      treeBushX2++;
      treeTrunkX2++;
    }
    // drawing trees
    fill(51, 0 ,0);
    treeTrunk(treeTrunkX1, 100, 50, 180);
    fill(0, 153, 0);
    treeBush(treeBushX1, 100, 90, 50);
    fill(51, 0 ,0);
    treeTrunk(treeTrunkX2, 100, 50, 180);
    fill(0, 153, 0);
    treeBush(treeBushX2, 100, 90, 50);
  }
  // define other methods down here.
  /**
  * drawing raindrops
  */ 
  public void mouseClicked(){
    fill(51, 153, 255);
    ellipse(mouseX, mouseY, 20, 20);
  } 
  /**
  * detecting movement when key is pressed
  */
  public void keyPressed() {
    if (keyCode == LEFT) {
       leftPressed = true;
     }else if (keyCode == RIGHT) {
       rightPressed = true;
     }
   }
  /**
  * detecting movement when key is released
  */
  public void keyReleased() {
    // drawing grass
    fill(0, 204, 0); 
    grass(0, 280, 600, 500);
    if (keyCode == LEFT) {
       leftPressed = false;
      }else if (keyCode == RIGHT) {
       rightPressed = false;
     }
   }
  /**
  * Drawing the house when mouse is released
  */
  public void mouseReleased(){
    // Drawing the house (Square)
    fill(153, 0, 0);
    house(170, 135, 220, 190);

    // Drawing the door (Rectangle)
    fill(153, 102, 0);
    door(252, 255, 50, 70);

    // Drawing windows (Squares)
    fill(204, 204, 204);
    window(320, 157, 40, 40);
    window(195, 157, 40, 40);
    window(195, 230, 30, 30);
    window(325, 230, 30, 30);
    
    // Drawing the roof (Triangle)
    fill(102, 51, 0);
    roof(272, 45, 407, 145, 157, 145);
  }
   /**
 * Method for the clouds
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the clouds
 */
 public void clouds(float X1, float Y1, float X2, float Y2){
    ellipse(X1, Y1, X2, Y2);
  }
  /**
 * Method for the house
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the house
 */
 public void house(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
 }
 /**
 * Method for the door
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the door
 */
 public void door(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
 }
 /**
 * Method for the roof
 * @param X1 The first horizontal coordinate
 * @param X2 The first vertical coordinate
 * @param X2 The second horizontal coordinate
 * @param Y2 The second vertical coordinate
 * @param X3 Horizontal size
 * @param Y3 Vertical size
 * @return the total area for the roof
 */
 public void roof(float X1, float Y1, float X2, float Y2, float X3, float Y3){
   triangle(X1, Y1, X2, Y2, X3, Y3);
 }
 /**
 * Method for the window
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the windows
 */
  public void window(float X1, float Y1, float X2, float Y2){
    rect(X1, Y1, X2, Y2);
  }
 /**
 * Method for the grass
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the grass
 */
 public void grass(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
 }
 /**
 * Method for the tree trunk
 * @param X1 The horizontal coordinate
 * @param X2 The vertical coordinate
 * @param X2 Horizontal size
 * @param Y2 Vertical size
 * @return the total area for the tree trunk
 */
 public void treeTrunk(float X1, float Y1, float X2, float Y2){
   rect(X1, Y1, X2, Y2);
 }
 /**
 * Method for the treebush
 * @param X1 Customizable horizontal coordinate
 * @param X2 Customizable vertical coordinate
 * @param X2 Customizable horizontal size
 * @param Y2 Customizable size
 * @return the total area for the tree bush
 */
 public void treeBush(float X1, float Y1, float X2, float Y2){
   ellipse(X1, Y1, X2, Y2);
 }
  
}