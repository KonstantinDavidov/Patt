using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Strategy.Interface;

namespace Strategy
{
	public class CalculateClient
	{
		private ICalculateStrategy calculateStrategy;

		public CalculateClient(ICalculateStrategy strategy)
		{
			calculateStrategy = strategy;
		}

		public int Calculate(int value1, int value2)
		{
			if (calculateStrategy == null) return 0;

			return calculateStrategy.Calculate(value1, value2);
		}
	}
}
