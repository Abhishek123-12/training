class StringBuild
{
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("tony");

        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.append("e");
        sb.append("e");
        sb.append("l");
        System.out.println(sb);
    }
}
