using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Strategy.Classes;

namespace Strategy
{
	class Program
	{
		static void Main(string[] args)
		{
			var minusClient = new CalculateClient(new Minus());

			Console.WriteLine("10 - 3 = " + minusClient.Calculate(10, 3));

			var plusClient = new CalculateClient(new Plus());

			Console.WriteLine("10 + 3 = " + plusClient.Calculate(10, 3));
			Console.ReadKey();
		}
	}
}
