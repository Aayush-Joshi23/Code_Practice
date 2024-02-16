class Solution {
    public boolean makeEqual(String[] words) {

		int letters[] = new int[26];
		for (int i = 0; i < words.length; i++) 
			checkLetters(words[i] , letters);
		

		int len = words.length;
		for (int i = 0; i < letters.length; i++) {
			if(letters[i] % len != 0) 
                return false;
		}
		return true;
	}


	public int[] checkLetters(String word , int[] letters) 
    {
		for (int i = 0; i < word.length(); i++) 
        {
			char c = word.charAt(i);
			letters[c-97]++;		
		}
		return letters;
	}
}