package net.rtriangle;

public class RtriangleProvider {
	private static final java.util.Random r = new java.util.Random();
	static {
		r.setSeed((new java.util.Date()).getTime());
	}
	public static Rtriangle getRtriangle(){
		boolean btriangle=r.nextBoolean();
		if(btriangle) {
			return new Rtriangle() {
				
				public int getApexY3() {
					return 0;
				}
				
				public int getApexY2() {
					return 3;
				}
				
				public int getApexY1() {
					return 0;
				}
				
				public int getApexX3() {
					return 0;
				}
				
				public int getApexX2() {
					return 0;
				}
				
				public int getApexX1() {
					return 4;
				}
			};
		}
		return new Rtriangle() {
			
			public int getApexY3() {
				return 0;
			}
			
			public int getApexY2() {
				return 1;
			}
			
			public int getApexY1() {
				return 5;
			}
			
			public int getApexX3() {
				return 0;
			}
			
			public int getApexX2() {
				return 4;
			}
			
			public int getApexX1() {
				return 7;
			}
		};
	}

}
