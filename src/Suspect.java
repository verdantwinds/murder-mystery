public class Suspect extends Person {

    public static final Suspect JON = new Suspect("Jon Lewis","Head of School", 800,500,"assets/jon.png",false);
    public static final Suspect OZ = new Suspect("Özgür Akgün","Lecturer", 800,500,"assets/oz.png",false);
    public static final Suspect RUTH = new Suspect("Ruth Hoffman","Lecturer", 800,500,"assets/ruth.png",false);
    public static final Suspect TRISTAN = new Suspect("Tristan Henderson","Lecturer", 800,500,"assets/tristan.png",false);
    public static final Suspect SALEEM = new Suspect("Saleem Bhatti","Professor", 800,500,"assets/saleem.png",false);
    public static final Suspect IAN = new Suspect("Ian Gent","Professor", 800,500,"assets/ian.png",false);
    public static final Suspect EDWIN = new Suspect("Edwin Brady","Reader", 800,500,"assets/edwin.png",false);

    private boolean isMurderer;

    public Suspect(String name, String description, int x, int y, String imageURL, boolean isMurderer) {
        super(name, description, x, y, imageURL);
        this.isMurderer = isMurderer;
    }


    public boolean isMurderer() {
        return isMurderer;
    }
}
