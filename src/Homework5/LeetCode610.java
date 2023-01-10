package Homework5;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

/* Task 610. Find Duplicate File in System
 * https://leetcode.com/problems/find-duplicate-file-in-system/description/
 */

public class LeetCode610 {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> fileMap = new HashMap();

        for(String path : paths){
            String[] files = path.split(" ");
            String directory = files[0];

            for(String file : files){
                int index = file.indexOf("(");
                if(index == -1) {
                    continue;
                }

                String fileName = file.substring(0, index);
                String fileContent = file.substring(index + 1, file.length() - 1);

                fileMap.putIfAbsent(fileContent, new ArrayList<String>());
                fileMap.get(fileContent).add(directory + "/" + fileName);
            }
        }

        List<List<String>> results = new ArrayList();
        for(List<String> files : fileMap.values()){
            if(files.size() > 1) {
                results.add(files);
            }
        }

        return results;
    }
}
