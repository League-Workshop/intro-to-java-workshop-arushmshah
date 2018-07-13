PImage catPic;
int x = 690;
int y = 465;

void setup()
{
size(1000, 1000);
catPic = loadImage("cat.jpg");
                catPic.resize(width, height);
background(catPic);
}

void keyPressed()
{
  x +=10;
  y +=10;
}
void draw()
{
  ellipse(x, y, 120, 120);
   ellipse(x - 430, y + 2, 120, 120);
   fill(#FF0F0F);
}