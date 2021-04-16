import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Letters {

	public static void main(String[] args) throws IOException {
		int cv = 0;
		int cc = 0;
		Character[] a = { 'a', 'o', 'e', 'u', 'i' };
		Set<Character> vowels = new HashSet<Character>(Arrays.asList(a));
		File file = new File("text.txt");
		file.createNewFile();
		FileReader fr = new FileReader(file);
		char[] arr = new char[(int) file.length()];
		fr.read(arr);
		fr.close();
		String str = String.valueOf(arr);
		str = str.toLowerCase();
		arr = str.toCharArray();
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				if (vowels.contains(arr[i])) {
					cv++;
				} else {
					cc++;
				}
			}
		}
		System.out.println(cv);
		System.out.println(cc);
	}

}
