package 중간프로젝트;

public class Mamechi {
	
	String characterName;		//이름
	int characterStress;		//스트레스
	int characterAffection;		//애정도
	int characterFullness;		//포만감
	int characterCleanliness;	//청결도
	int characterLevel;			//레벨
	
	
	//생성자
	public Mamechi(String characterName, int characterStress, int characterAffection,
			 int characterFullness, int characterCleanliness, int characterLevel) {
		
		this.characterName = characterName;
		this.characterStress = characterStress;
		this.characterAffection = characterAffection;
		this.characterFullness = characterFullness;
		this.characterCleanliness = characterCleanliness;
		this.characterLevel = characterLevel;
	}


	public String getCharacterName() {
		return characterName;
	}


	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	public int getCharacterStress() {
		return characterStress;
	}


	public void setCharacterStress(int characterStress) {
		this.characterStress = characterStress;
	}


	public int getCharacterAffection() {
		return characterAffection;
	}


	public void setCharacterAffection(int characterAffection) {
		this.characterAffection = characterAffection;
	}


	public int getCharacterFullness() {
		return characterFullness;
	}


	public void setCharacterFullness(int characterFullness) {
		this.characterFullness = characterFullness;
	}


	public int getCharacterCleanliness() {
		return characterCleanliness;
	}


	public void setCharacterCleanliness(int characterCleanliness) {
		this.characterCleanliness = characterCleanliness;
	}


	public int getCharacterLevel() {
		return characterLevel;
	}


	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
	}


	@Override
	public String toString() {
		return "Mamechi [characterName=" + characterName + ", characterStress=" + characterStress
				+ ", characterAffection=" + characterAffection + ", characterFullness=" + characterFullness
				+ ", characterCleanliness=" + characterCleanliness + ", characterLevel=" + characterLevel + "]";
	}




	
}
