PImage rainbow; 
PImage unicorn;
void setup(){
  rainbow = loadImage("rainbow.png");
  size(800,500);
  rainbow.resize(width,height);
  unicorn = loadImage("Unicorn.png");
}

void draw(){
    background(rainbow);
    image(unicorn, mouseX, mouseY);
}