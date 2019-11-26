object slip7
{
	def main(args:Array[String])
	{
		println("Enter rows and colums")
		var r:Int=Console.readInt
		var c:Int=Console.readInt
		val arr1=Array.ofDim[Int](r,c);
		val arr2=Array.ofDim[Int](r,c);
		var rarry=Array.ofDim[Int](r,c)	;
                  var isupper=1;	

		println("Enter Matrix1");
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				arr1(i)(j)=Console.readInt();
			}
		}
		println("Enter Matrix2");
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				arr2(i)(j)=Console.readInt();
			}
		}
		println("MATRIX -1");
	
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				print(arr1(i)(j)+" ");
			}	
			println();
		}
		println("MATRIX -2");
	
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				print(arr2(i)(j)+" ");
			}	
			println();
		}
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				rarry(i)(j)=0;
				for(k<-0 until c)
						rarry(i)(j)=rarry(i)(j)+arr1(i)(k)*arr2(k)(j);
			}
		}
		println("RESULTANT MATRIX");
		
		for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				print(rarry(i)(j)+" ");
			}	
			println();
		}
for(i<-0 until r)
		{
			for(j<-0 until c)
			{
				if((i>j)&&(rarry(i)(j)!=0))
					 isupper=0;
			}
		}
		if(isupper==1)
			println("Matrix is upper triangular");
		else
			println("Matrix is not upper triangular")
		


		}}

