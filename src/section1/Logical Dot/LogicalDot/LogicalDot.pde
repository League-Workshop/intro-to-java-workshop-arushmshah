void setup()
{
  size(800,800);
  
  
}

void draw()
{
  if(mousePressed)
  {
  fill(#1DA6ED);
  ellipse(mouseX,mouseY,100,100);
  }
  else
  {
     fill(#ED901D);
  ellipse(mouseX,mouseY,100,100);
    
  }
}