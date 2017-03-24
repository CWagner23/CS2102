class Shark extends Fish{
    int attacks;
    
    Shark(){
    	super(1, 3.75);
    	this.attacks = 4;
    }

    
    Shark (int length) {
      super(length, 3.75);
      this.attacks = 2;
    }
    
    
    Shark(int length, int attacks){
    	super(length, 3.75);
    	this.attacks = attacks;
    }


    public boolean isNormalSize () {
      return 6 <= this.length;
    }
    
    public boolean isDangerToPeople(){
    	return this.attacks > 0;
    }
    
  }

