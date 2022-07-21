import java.util.*;

class GenerateDocument {


    public boolean generateDocument(String characters, String document) {
        //  check if character of the document is in the characters String
        for (int i = 0; i < document.length(); i++) {
            if (!characters.contains(document.substring(i, i + 1))) {
                return false;
            } else {
                // remove the character from the characters string
                characters = characters.replaceFirst(document.substring(i, i + 1), "");
            }
        }
        //  if not, return false
        return true;
    }
}
