public class classmainstackgeneric {

	
	public static void main(String[] args) {
		classstackgeneric<Integer> st = new classstackgeneric<Integer>();



        st.push(2);

        st.push(1);

        st.push(2);
        st.cetak();



        System.out.println("Size: " + st.size());

        System.out.println(st.pop());

        

    }


}
