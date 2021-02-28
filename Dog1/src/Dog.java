// mohammd rashed  balhreth



class Dog{
	 String Breed;
	 String size;
	 String colour;
	 String age;
	 String name;
	 String Eat;
	
	 
 Dog(){
	 
 }
	
 Dog(String newBreed,String newsize,String newcolour,String newage,String whatname ,String Whateat) {
	 Breed=newBreed;
	 size =newsize;
	 colour=newcolour;
	 age=newage;
	 name=whatname;
	 Eat=Whateat;
 } 
 String whatname() {
	 return name;
 }
 String whateat () {
	 return Eat;
 }
 
}