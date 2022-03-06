public class Suspect extends Person {

    public static final Suspect JON = new Suspect("Jon Lewis","Head of School", 525,50,"assets/jon.png",false);
    public static final Suspect OZ = new Suspect("Özgür Akgün","Lecturer", 800,500,"assets/oz.png",false);
    public static final Suspect RUTH = new Suspect("Ruth Hoffmann","Lecturer", 800,500,"assets/ruth.png",false);
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

    public void startDialogue(GuiDialogueBox box){
        switch (name){
            case "Jon Lewis":
                box.enterText("oooooooooggggh my name is jon lewis i love the weather");
                break;
            case "Özgür Akgün":
                box.enterText("wagwan i am oz ");
                break;
            case "Ruth Hoffmann":
                box.enterText("hi, it's ruth");
                break;
            case "Tristan Henderson":
                box.enterText("i'm tristan and windows suckz");
                break;
            case "Saleem Bhatti":
                box.enterText("it's saleem! ");
                break;
            case "Ian Gent":
                box.enterText("yo yo yo it's ian");
                break;
            case "Edwin Brady":
                box.enterText("i'm edwin - haskell4thewin");
                break;
        }

    }

    public void q1Dialogue(GuiDialogueBox box){
        switch (name){
            case "Jon Lewis":
                if (!isMurderer) {
                    box.enterText("Uhm, I was in my office doing work. There was weather to be admired.");
                    break;
                } else {
                    box.enterText("Uhm, I think I was in my office doing some work. The weather was a bit dreary.");
                    break;
                }
            case "Özgür Akgün":
                box.enterText("I wasn't near where it happened, I didn't hear about what happened until an hour ago.");
                break;
            case "Ruth Hoffmann":
                box.enterText("I was in my office, I didn't even know what was happening.");
                break;
            case "Tristan Henderson":
                box.enterText("I was smashing windows in John Honey, I didn't even hear anything.");
                break;
            case "Saleem Bhatti":
                box.enterText("I was campaigning for the adoption of IPv6 in my office.");
                break;
            case "Ian Gent":
                box.enterText("Squatting dramatically by the pier if you have to know >:(");
                break;
            case "Edwin Brady":
                box.enterText("Definitely not Haskilling anyone, I promise.");
                break;
        }
    }

    public void q2Dialogue(GuiDialogueBox box){
        switch (name){
            case "Jon Lewis":
                if (isMurderer) {
                    box.enterText("I haven't really looked, fine, I suppose?");
                    break;
                } else {
                    box.enterText("Oh the weather is great today! It's lovely to see the sun out in St Andrews.");
                    break;
                }
            case "Özgür Akgün":
                box.enterText("Not too bad, but you can never tell with St Andrews.");
                break;
            case "Ruth Hoffmann":
                box.enterText("Not too bad, typical St Andrews weather. There's more important things to talk about though.");
                break;
            case "Tristan Henderson":
                box.enterText("I wasn't really paying attention on my way in, which is a good thing I guess.");
                break;
            case "Saleem Bhatti":
                box.enterText("Pretty good! Can't complain all considered.");
                break;
            case "Ian Gent":
                box.enterText("Perfect squatting weather if I've ever seen it!");
                break;
            case "Edwin Brady":
                box.enterText("Not bad at all. Not exactly what we should be talking about is it?");
                break;
        }

    }
}
