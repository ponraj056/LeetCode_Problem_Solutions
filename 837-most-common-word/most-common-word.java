class Solution {
    public String mostCommonWord(String p, String[] ban) {
        p = p.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        String arr[] = p.trim().split("\\s+");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
          boolean valid = true;
            for (int j = 0; j < ban.length; j++) {
                if (arr[i].equals(ban[j])) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (int k : map.values()) {
            max = Math.max(max, k);
        }
        String res = "";
        for (String m : map.keySet()) {
            if (map.get(m) == max) {
                res = m;
                break;
            }
        }
        return res;
    }
}