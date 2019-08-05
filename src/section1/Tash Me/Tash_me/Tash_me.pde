PImage mustache;
  PImage Trump;
void setup() {
  Trump = loadImage("Trump.jpeg");
    size(500,300);
    Trump.resize(500,300);
    mustache = loadImage("Mustache.png");
}
void draw() {
  background(Trump);
  mustache.resize(100,150);
  image(mustache,mouseX,mouseY);
}
