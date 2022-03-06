public class Suspect extends Person {

    public static final Suspect JON = new Suspect("Jon Lewis","Head of School", 128,406,"assets/jon.png",true);
    public static final Suspect OZ = new Suspect("Özgür Akgün","Lecturer", 100,650,"assets/oz.png",false);
    public static final Suspect RUTH = new Suspect("Ruth Hoffmann","Lecturer", 1000,500,"assets/ruth.png",false);
    public static final Suspect TRISTAN = new Suspect("Tristan Henderson","Lecturer", 779,232,"assets/tristan.png",false);
    public static final Suspect SALEEM = new Suspect("Saleem Bhatti","Professor", 678,495,"assets/saleem.png",false);
    public static final Suspect IAN = new Suspect("Ian Gent","Professor", 260,25,"assets/ian.png",false);
    public static final Suspect EDWIN = new Suspect("Edwin Brady","Reader", 444,337,"assets/edwin.png",false);

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
                box.enterText("It's Jon.");
                break;
            case "Özgür Akgün":
                box.enterText("It's Oz.");
                break;
            case "Ruth Hoffmann":
                box.enterText("It's Ruth.");
                break;
            case "Tristan Henderson":
                box.enterText("It's Tristan.");
                break;
            case "Saleem Bhatti":
                box.enterText("It's Saleem.");
                break;
            case "Ian Gent":
                box.enterText("It's Ian.");
                break;
            case "Edwin Brady":
                box.enterText("It's Edwin.");
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

    public void q3Dialogue(GuiDialogueBox box){
        switch (name){
            case "Jon Lewis":
                if (isMurderer) {
                    box.enterText("If I'm honest, I'm not too surprised about all this, they weren't pleasant.");
                    break;
                } else {
                    box.enterText("It was really good, I'm so sorry about what happened to them.");
                    break;
                }
            case "Özgür Akgün":
                box.enterText("Not good, if I'm honest. Even then I wouldn't wish this on anyone.");
                break;
            case "Ruth Hoffmann":
                box.enterText("Fine. But this is awful, I can't believe something like this happened.");
                break;
            case "Tristan Henderson":
                box.enterText("They used Windows. That is all I have to say.");
                break;
            case "Saleem Bhatti":
                box.enterText("They were the only person I wouldn't let call me Papa.");
                break;
            case "Ian Gent":
                box.enterText("I invented teabagging just for them.");
                break;
            case "Edwin Brady":
                box.enterText("This is unfortunately what they get for not sharing my love of Haskell.");
                break;
        }
    }

    public void q4Dialogue(GuiDialogueBox box){
        switch (name){
            case "Jon Lewis":
                if (isMurderer) {
                    box.enterText("Oh probably the milk first.");
                    break;
                } else {
                    box.enterText("Cereal, definitely. It's a great way to start the day.");
                    break;
                }
            case "Özgür Akgün":
                if (isMurderer) {
                    box.enterText("Milk, I think. Cereal first sounds strange.");
                    break;
                } else {
                    box.enterText("Cereal for sure, milk first sounds very strange.");
                    break;
                }
            case "Ruth Hoffmann":
                if (isMurderer) {
                    box.enterText("Oh milk, without a doubt.");
                    break;
                } else {
                    box.enterText("Cereal! Anything else is just wrong.");
                    break;
                }
            case "Tristan Henderson":
                if (isMurderer) {
                    box.enterText("Definitely milk. The cereal gets soggy otherwise.");
                    break;
                } else {
                    box.enterText("Cereal, milk first sounds like Windows user behaviour.");
                    break;
                }
            case "Saleem Bhatti":
                if (isMurderer) {
                    box.enterText("I'm not too sure. Milk?");
                    break;
                } else {
                    box.enterText("It has to be cereal right?.");
                    break;
                }
            case "Ian Gent":
                if (isMurderer) {
                    box.enterText("Milk. Absolutely milk.");
                    break;
                } else {
                    box.enterText("Cereal, what is wrong with you?");
                    break;
                }
            case "Edwin Brady":
                if (isMurderer) {
                    box.enterText("Cereal after the milk? Who hurt you?");
                    break;
                } else {
                    box.enterText("Milk after the cereal? Who hurt you?");
                    break;
                }
        }
    }


}
