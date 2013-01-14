/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate.seamen;

/**
 *
 * @author Ben
 */
public class Vernacularrrgh {
    public static final String[] PARTS_OF_SPEECH = {"(N)", "(A)", "(I)"};
    public static final String[] NOUNS = {"Grog", "Pirate", "Loot", "Treasure", "Lubber", "Rum", "Hornpipe", "Scallawags", "Maiden", "Davy Jones' Locker", "Blaggard", "Poop Deck", "Wench", "Lass", "Bung Hole", "Darlin", "Parrot", "Matey", "Booty", "Cutlass", "Scabbard", "Britches", "Timbers", "Hull", "Vessel", "Poop Deck"};
    public static final String[] ADJECTIVES = {"Rum", "Rum-Bum", "Salty", "Swashbucklin", "Scurvy", "mush-mouthed", "Pustulant", "Savvy", "Saucy", "Bilge-sucking"};
    public static final String[] INTERJECTIONS = {"Avast!", "Yo, ho, ho!", "Shiver Me Timbers!", "Arrrgh!", "ARRRGH!", "AAAAAAAAAAARGHGGHGHG!", "Ahoy!", "Aye!", "Show a Leg!"};
    public static final String[] PICK_UP_LINES = {
	"Avast, me proud beauty! Wanna know why my Roger is so Jolly?",
	"Have ya ever met a man with a real yardarm?",
	"Come on up and see me urchins.",
	"Yes, that is a hornpipe in my pocket and I am happy to see you.",
	"I'd love to drop anchor in your lagoon.",
	"Pardon me, but would ya mind if I fired me cannon through your porthole?",
	"How'd you like to scrape the barnacles off of me rudder?",
	"Ya know, darlin’, I’m 97 percent chum free.",
	"Well blow me down?",
	"Prepare to be boarded.",
	"They don’t call me Long John because my head is so big.",
	"You’re drinking a Salty Dog? How’d you like to try the real thing?",
	"Wanna shiver me timbers?",
	"I’ve sailed the seven seas, and you’re the sleekest schooner I’ve ever sighted.",
	"Brwaack! Polly want a cracker? … Oh, wait. That’s for Talk Like a PARROT Day.",
	"That’s the finest pirate booty I’ve ever laid eyes on.",
	"Let's get together and haul some keel.",
	"That’s some treasure chest you’ve got there.",
	"Is that a belayin' pin in yer britches, or are ye ... (this one is never completed)",
	"Come show me how ye bury yer treasure, lad!",
	"So, tell me, why do they call ye, Cap'n Feathersword?",
	"That's quite a cutlass ye got thar, what ye need is a good scabbard!",
	"Aye, I guarantee ye, I've had a twenty percent decrease in me lice ratio!",
	"I've crushed seventeen men's skulls between me thighs!",
	"C'mon, lad, shiver me timbers!",
	"You. Pants Off. Now!"   
    };
    
    public static final String[] SENTENCES = {
	"Shiver me (A) (N)!",
	"Yo, ho, ho! N' a bottl' a' (N)!",
	"Arrrgh!  Why ye' be messin' with me (A) (N)!",
	"(I) I been meanin' ta tell ye suthn'...  My (N) be (A)!",
	"GitHub be (A)ier than a (A) (N)!"
    };
    
    public static String get(String type){
	if(type == "(N)"){
	    return NOUNS[(int)(Math.random() * NOUNS.length)];
	} else if(type == "(A)"){
	    return ADJECTIVES[(int)(Math.random() * ADJECTIVES.length)];
	} else if(type == "(I)"){
	    return INTERJECTIONS[(int)(Math.random() * INTERJECTIONS.length)];
	} else {
	    return "ARRRGH!";
	}
    }
}