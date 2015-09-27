public class Box{
  
  protected double length;
  protected double width;
  protected double height;

  public Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  } 

  @Override
  public boolean equals(Object o) {
      if(o == this)
          return true;
      if(!(o instanceof Box))
          return false;
      Box b = (Box)o;
      return (Double.compare(this.getVolume(),b.getVolume()) == 0)?true:false;
  }

  @Override
  public int hashCode(){
      return Double.valueOf(this.getVolume()).hashCode();
  }

  public void setLength(double length){
      this.length = length;
  }

  public void setWidth(double width){
      this.width = width;
  }
  public void setHeight(double height){
      this.height = height;
  }

  public double getLength(){
      return this.length;
  }

  public double getHeight(){
      return this.height;
  }

  public double getWidth(){
      return this.width;
  }
  
  public double getVolume() {
      return this.length * this.height * this.width;
  }

}
