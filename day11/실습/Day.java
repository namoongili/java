package day11.실습;

	public class Day {
		String title;
		String date;
		String desc;
		String result;
		
		public Day() {

		}

		public Day(String title, String date, String desc, String result) {
			super();
			this.title = title;
			this.date = date;
			this.desc = desc;
			this.result = result;
		}
		
		{
			
		}

		@Override
		public String toString() {
			return "Day [title=" + title + ", date=" + date + ", desc=" + desc + ", result=" + result + "]";
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getDate() {
			return date;
		}

		

	 
		
		
	}


