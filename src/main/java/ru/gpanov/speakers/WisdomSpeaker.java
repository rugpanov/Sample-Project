package ru.gpanov.speakers;

public class WisdomSpeaker implements Speaker {
    public void say() {
         String wisdom = "Your work is going to fill a large part of your life, " +
                "and the only way to be truly satisfied is to do what you believe " +
                "is great work. And the only way to do great work is to love what you do." +
                "If you haven't found it yet, keep looking. Don't settle. As with all matters " +
                "of the heart, you'll know when you find it.";
        System.out.println(wisdom);
    }
}
