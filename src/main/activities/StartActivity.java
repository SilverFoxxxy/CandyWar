package main.activities;

import main.GrUI.Element;
import main.grui.ElementSource;

public class StartActivity extends Activity{
	
	public StartActivity() {
		super();
		activityName = "Start";
		elems.add("Start", new Element("Start", 1/3., 1/3., 1/3., 1/3., true, "YellowBear", true, 0));
	}
	
	public void move() {
		if (globalVar.containsKey("Start")) {
			if (globalVar.get("Start") == 1) {
				//System.out.println("Start is pressed");
				toRemove = true;
				elems.remove("Start");
				FrontBoardActivity battle = new FrontBoardActivity();
				toAdd2Parent.add(battle);
			}
		}
	}
	
	public ElementSource show() {
		return elems;
	}
	/*public ArrayList<Element> show() {
		return elems;
	}*/
}
