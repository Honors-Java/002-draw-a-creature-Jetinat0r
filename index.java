void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
  background(60);
  stroke(0);

  //Tongue
  fill(218, 93, 93);
  ellipse(280, 200, 50, 20);

  //Body
  fill(21, 128, 0);
  ellipse(180, 200, 200, 200);

  //Shoe
  fill(127, 57, 57);
  rect(240, 300, 120, 60);
  
  //Eyeball
  fill(255);
  ellipse(240, 120, 50, 50);

  //Pupil
  fill(0);
  ellipse(255, 115, 20, 20);
 
	//Hair
  line(135, 110, 100, 100);
  line(143, 106, 134, 83);
  line(163, 101, 152, 82);
}