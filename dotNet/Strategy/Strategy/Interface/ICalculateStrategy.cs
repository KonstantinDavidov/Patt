using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy.Interface
{
	public interface ICalculateStrategy
	{
		int Calculate(int value1, int value2);
	}
}
