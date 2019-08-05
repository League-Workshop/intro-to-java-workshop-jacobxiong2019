void setup() {
  size(1000,800);
}
void draw() {
  fill(#711119);
  if (mousePressed) {
    fill(#25A74B);
  } else {
    fill(#711119);
  }
  ellipse(500,400,125,125);
}
