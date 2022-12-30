package day2;
import java.util.*;

/* 3. Write a program to evaluate, the following investment equation: V=P ( 1 + r )n
and print the tables which would give the values of V for various combinations of the
following values of P, r & n.
P : 1000,2000,3000,………..,10,000 R : 0.10,0.11,0.12,…………….0.20
n : 1,2,3,…………………………,10 */

public class q3 {

	public static void main(String[] args) {
		System.out.println("P \t\t\t\t R \t\t\t\t n \t\t\t\t V"); 
		//Printing table headings and using \t escape sequence
		for(int i=1000; i<=10000; i+=1000)
		{
			for(double j=0.10; j<=0.20; j+=0.01)
			{
				for(int k=1; k<=10; k++)
					System.out.printf("%d\t\t\t\t%.2f\t\t\t\t%d\t\t\t\t%.2f\n",i,j,k,(i*Math.pow((1+j),k)));
			}
		}
	}

}

/* OUTPUT =
P 				 R 				 n 				 V
1000				0.10				1				1100.00
1000				0.10				2				1210.00
1000				0.10				3				1331.00
1000				0.10				4				1464.10
1000				0.10				5				1610.51
1000				0.10				6				1771.56
1000				0.10				7				1948.72
1000				0.10				8				2143.59
1000				0.10				9				2357.95
1000				0.10				10				2593.74
1000				0.11				1				1110.00
1000				0.11				2				1232.10
1000				0.11				3				1367.63
1000				0.11				4				1518.07
1000				0.11				5				1685.06
1000				0.11				6				1870.41
1000				0.11				7				2076.16
1000				0.11				8				2304.54
1000				0.11				9				2558.04
1000				0.11				10				2839.42
1000				0.12				1				1120.00
1000				0.12				2				1254.40
1000				0.12				3				1404.93
1000				0.12				4				1573.52
1000				0.12				5				1762.34
1000				0.12				6				1973.82
1000				0.12				7				2210.68
1000				0.12				8				2475.96
1000				0.12				9				2773.08
1000				0.12				10				3105.85
1000				0.13				1				1130.00
1000				0.13				2				1276.90
1000				0.13				3				1442.90
1000				0.13				4				1630.47
1000				0.13				5				1842.44
1000				0.13				6				2081.95
1000				0.13				7				2352.61
1000				0.13				8				2658.44
1000				0.13				9				3004.04
1000				0.13				10				3394.57
1000				0.14				1				1140.00
1000				0.14				2				1299.60
1000				0.14				3				1481.54
1000				0.14				4				1688.96
1000				0.14				5				1925.41
1000				0.14				6				2194.97
1000				0.14				7				2502.27
1000				0.14				8				2852.59
1000				0.14				9				3251.95
1000				0.14				10				3707.22
1000				0.15				1				1150.00
1000				0.15				2				1322.50
1000				0.15				3				1520.87
1000				0.15				4				1749.01
1000				0.15				5				2011.36
1000				0.15				6				2313.06
1000				0.15				7				2660.02
1000				0.15				8				3059.02
1000				0.15				9				3517.88
1000				0.15				10				4045.56
1000				0.16				1				1160.00
1000				0.16				2				1345.60
1000				0.16				3				1560.90
1000				0.16				4				1810.64
1000				0.16				5				2100.34
1000				0.16				6				2436.40
1000				0.16				7				2826.22
1000				0.16				8				3278.41
1000				0.16				9				3802.96
1000				0.16				10				4411.44
1000				0.17				1				1170.00
1000				0.17				2				1368.90
1000				0.17				3				1601.61
1000				0.17				4				1873.89
1000				0.17				5				2192.45
1000				0.17				6				2565.16
1000				0.17				7				3001.24
1000				0.17				8				3511.45
1000				0.17				9				4108.40
1000				0.17				10				4806.83
1000				0.18				1				1180.00
1000				0.18				2				1392.40
1000				0.18				3				1643.03
1000				0.18				4				1938.78
1000				0.18				5				2287.76
1000				0.18				6				2699.55
1000				0.18				7				3185.47
1000				0.18				8				3758.86
1000				0.18				9				4435.45
1000				0.18				10				5233.84
1000				0.19				1				1190.00
1000				0.19				2				1416.10
1000				0.19				3				1685.16
1000				0.19				4				2005.34
1000				0.19				5				2386.35
1000				0.19				6				2839.76
1000				0.19				7				3379.32
1000				0.19				8				4021.39
1000				0.19				9				4785.45
1000				0.19				10				5694.68
2000				0.10				1				2200.00
2000				0.10				2				2420.00
2000				0.10				3				2662.00
2000				0.10				4				2928.20
2000				0.10				5				3221.02
2000				0.10				6				3543.12
2000				0.10				7				3897.43
2000				0.10				8				4287.18
2000				0.10				9				4715.90
2000				0.10				10				5187.48
2000				0.11				1				2220.00
2000				0.11				2				2464.20
2000				0.11				3				2735.26
2000				0.11				4				3036.14
2000				0.11				5				3370.12
2000				0.11				6				3740.83
2000				0.11				7				4152.32
2000				0.11				8				4609.08
2000				0.11				9				5116.07
2000				0.11				10				5678.84
2000				0.12				1				2240.00
2000				0.12				2				2508.80
2000				0.12				3				2809.86
2000				0.12				4				3147.04
2000				0.12				5				3524.68
2000				0.12				6				3947.65
2000				0.12				7				4421.36
2000				0.12				8				4951.93
2000				0.12				9				5546.16
2000				0.12				10				6211.70
2000				0.13				1				2260.00
2000				0.13				2				2553.80
2000				0.13				3				2885.79
2000				0.13				4				3260.95
2000				0.13				5				3684.87
2000				0.13				6				4163.90
2000				0.13				7				4705.21
2000				0.13				8				5316.89
2000				0.13				9				6008.08
2000				0.13				10				6789.13
2000				0.14				1				2280.00
2000				0.14				2				2599.20
2000				0.14				3				2963.09
2000				0.14				4				3377.92
2000				0.14				5				3850.83
2000				0.14				6				4389.95
2000				0.14				7				5004.54
2000				0.14				8				5705.17
2000				0.14				9				6503.90
2000				0.14				10				7414.44
2000				0.15				1				2300.00
2000				0.15				2				2645.00
2000				0.15				3				3041.75
2000				0.15				4				3498.01
2000				0.15				5				4022.71
2000				0.15				6				4626.12
2000				0.15				7				5320.04
2000				0.15				8				6118.05
2000				0.15				9				7035.75
2000				0.15				10				8091.12
2000				0.16				1				2320.00
2000				0.16				2				2691.20
2000				0.16				3				3121.79
2000				0.16				4				3621.28
2000				0.16				5				4200.68
2000				0.16				6				4872.79
2000				0.16				7				5652.44
2000				0.16				8				6556.83
2000				0.16				9				7605.92
2000				0.16				10				8822.87
2000				0.17				1				2340.00
2000				0.17				2				2737.80
2000				0.17				3				3203.23
2000				0.17				4				3747.77
2000				0.17				5				4384.90
2000				0.17				6				5130.33
2000				0.17				7				6002.48
2000				0.17				8				7022.91
2000				0.17				9				8216.80
2000				0.17				10				9613.66
2000				0.18				1				2360.00
2000				0.18				2				2784.80
2000				0.18				3				3286.06
2000				0.18				4				3877.56
2000				0.18				5				4575.52
2000				0.18				6				5399.11
2000				0.18				7				6370.95
2000				0.18				8				7517.72
2000				0.18				9				8870.91
2000				0.18				10				10467.67
2000				0.19				1				2380.00
2000				0.19				2				2832.20
2000				0.19				3				3370.32
2000				0.19				4				4010.68
2000				0.19				5				4772.71
2000				0.19				6				5679.52
2000				0.19				7				6758.63
2000				0.19				8				8042.77
2000				0.19				9				9570.90
2000				0.19				10				11389.37
3000				0.10				1				3300.00
3000				0.10				2				3630.00
3000				0.10				3				3993.00
3000				0.10				4				4392.30
3000				0.10				5				4831.53
3000				0.10				6				5314.68
3000				0.10				7				5846.15
3000				0.10				8				6430.77
3000				0.10				9				7073.84
3000				0.10				10				7781.23
3000				0.11				1				3330.00
3000				0.11				2				3696.30
3000				0.11				3				4102.89
3000				0.11				4				4554.21
3000				0.11				5				5055.17
3000				0.11				6				5611.24
3000				0.11				7				6228.48
3000				0.11				8				6913.61
3000				0.11				9				7674.11
3000				0.11				10				8518.26
3000				0.12				1				3360.00
3000				0.12				2				3763.20
3000				0.12				3				4214.78
3000				0.12				4				4720.56
3000				0.12				5				5287.03
3000				0.12				6				5921.47
3000				0.12				7				6632.04
3000				0.12				8				7427.89
3000				0.12				9				8319.24
3000				0.12				10				9317.54
3000				0.13				1				3390.00
3000				0.13				2				3830.70
3000				0.13				3				4328.69
3000				0.13				4				4891.42
3000				0.13				5				5527.31
3000				0.13				6				6245.86
3000				0.13				7				7057.82
3000				0.13				8				7975.33
3000				0.13				9				9012.13
3000				0.13				10				10183.70
3000				0.14				1				3420.00
3000				0.14				2				3898.80
3000				0.14				3				4444.63
3000				0.14				4				5066.88
3000				0.14				5				5776.24
3000				0.14				6				6584.92
3000				0.14				7				7506.81
3000				0.14				8				8557.76
3000				0.14				9				9755.85
3000				0.14				10				11121.66
3000				0.15				1				3450.00
3000				0.15				2				3967.50
3000				0.15				3				4562.62
3000				0.15				4				5247.02
3000				0.15				5				6034.07
3000				0.15				6				6939.18
3000				0.15				7				7980.06
3000				0.15				8				9177.07
3000				0.15				9				10553.63
3000				0.15				10				12136.67
3000				0.16				1				3480.00
3000				0.16				2				4036.80
3000				0.16				3				4682.69
3000				0.16				4				5431.92
3000				0.16				5				6301.02
3000				0.16				6				7309.19
3000				0.16				7				8478.66
3000				0.16				8				9835.24
3000				0.16				9				11408.88
3000				0.16				10				13234.31
3000				0.17				1				3510.00
3000				0.17				2				4106.70
3000				0.17				3				4804.84
3000				0.17				4				5621.66
3000				0.17				5				6577.34
3000				0.17				6				7695.49
3000				0.17				7				9003.73
3000				0.17				8				10534.36
3000				0.17				9				12325.20
3000				0.17				10				14420.49
3000				0.18				1				3540.00
3000				0.18				2				4177.20
3000				0.18				3				4929.10
3000				0.18				4				5816.33
3000				0.18				5				6863.27
3000				0.18				6				8098.66
3000				0.18				7				9556.42
3000				0.18				8				11276.58
3000				0.18				9				13306.36
3000				0.18				10				15701.51
3000				0.19				1				3570.00
3000				0.19				2				4248.30
3000				0.19				3				5055.48
3000				0.19				4				6016.02
3000				0.19				5				7159.06
3000				0.19				6				8519.28
3000				0.19				7				10137.95
3000				0.19				8				12064.16
3000				0.19				9				14356.35
3000				0.19				10				17084.05
4000				0.10				1				4400.00
4000				0.10				2				4840.00
4000				0.10				3				5324.00
4000				0.10				4				5856.40
4000				0.10				5				6442.04
4000				0.10				6				7086.24
4000				0.10				7				7794.87
4000				0.10				8				8574.36
4000				0.10				9				9431.79
4000				0.10				10				10374.97
4000				0.11				1				4440.00
4000				0.11				2				4928.40
4000				0.11				3				5470.52
4000				0.11				4				6072.28
4000				0.11				5				6740.23
4000				0.11				6				7481.66
4000				0.11				7				8304.64
4000				0.11				8				9218.15
4000				0.11				9				10232.15
4000				0.11				10				11357.68
4000				0.12				1				4480.00
4000				0.12				2				5017.60
4000				0.12				3				5619.71
4000				0.12				4				6294.08
4000				0.12				5				7049.37
4000				0.12				6				7895.29
4000				0.12				7				8842.73
4000				0.12				8				9903.85
4000				0.12				9				11092.32
4000				0.12				10				12423.39
4000				0.13				1				4520.00
4000				0.13				2				5107.60
4000				0.13				3				5771.59
4000				0.13				4				6521.89
4000				0.13				5				7369.74
4000				0.13				6				8327.81
4000				0.13				7				9410.42
4000				0.13				8				10633.78
4000				0.13				9				12016.17
4000				0.13				10				13578.27
4000				0.14				1				4560.00
4000				0.14				2				5198.40
4000				0.14				3				5926.18
4000				0.14				4				6755.84
4000				0.14				5				7701.66
4000				0.14				6				8779.89
4000				0.14				7				10009.08
4000				0.14				8				11410.35
4000				0.14				9				13007.79
4000				0.14				10				14828.89
4000				0.15				1				4600.00
4000				0.15				2				5290.00
4000				0.15				3				6083.50
4000				0.15				4				6996.02
4000				0.15				5				8045.43
4000				0.15				6				9252.24
4000				0.15				7				10640.08
4000				0.15				8				12236.09
4000				0.15				9				14071.51
4000				0.15				10				16182.23
4000				0.16				1				4640.00
4000				0.16				2				5382.40
4000				0.16				3				6243.58
4000				0.16				4				7242.56
4000				0.16				5				8401.37
4000				0.16				6				9745.59
4000				0.16				7				11304.88
4000				0.16				8				13113.66
4000				0.16				9				15211.85
4000				0.16				10				17645.74
4000				0.17				1				4680.00
4000				0.17				2				5475.60
4000				0.17				3				6406.45
4000				0.17				4				7495.55
4000				0.17				5				8769.79
4000				0.17				6				10260.66
4000				0.17				7				12004.97
4000				0.17				8				14045.81
4000				0.17				9				16433.60
4000				0.17				10				19227.31
4000				0.18				1				4720.00
4000				0.18				2				5569.60
4000				0.18				3				6572.13
4000				0.18				4				7755.11
4000				0.18				5				9151.03
4000				0.18				6				10798.22
4000				0.18				7				12741.90
4000				0.18				8				15035.44
4000				0.18				9				17741.82
4000				0.18				10				20935.34
4000				0.19				1				4760.00
4000				0.19				2				5664.40
4000				0.19				3				6740.64
4000				0.19				4				8021.36
4000				0.19				5				9545.41
4000				0.19				6				11359.04
4000				0.19				7				13517.26
4000				0.19				8				16085.54
4000				0.19				9				19141.79
4000				0.19				10				22778.74
5000				0.10				1				5500.00
5000				0.10				2				6050.00
5000				0.10				3				6655.00
5000				0.10				4				7320.50
5000				0.10				5				8052.55
5000				0.10				6				8857.81
5000				0.10				7				9743.59
5000				0.10				8				10717.94
5000				0.10				9				11789.74
5000				0.10				10				12968.71
5000				0.11				1				5550.00
5000				0.11				2				6160.50
5000				0.11				3				6838.16
5000				0.11				4				7590.35
5000				0.11				5				8425.29
5000				0.11				6				9352.07
5000				0.11				7				10380.80
5000				0.11				8				11522.69
5000				0.11				9				12790.18
5000				0.11				10				14197.10
5000				0.12				1				5600.00
5000				0.12				2				6272.00
5000				0.12				3				7024.64
5000				0.12				4				7867.60
5000				0.12				5				8811.71
5000				0.12				6				9869.11
5000				0.12				7				11053.41
5000				0.12				8				12379.82
5000				0.12				9				13865.39
5000				0.12				10				15529.24
5000				0.13				1				5650.00
5000				0.13				2				6384.50
5000				0.13				3				7214.48
5000				0.13				4				8152.37
5000				0.13				5				9212.18
5000				0.13				6				10409.76
5000				0.13				7				11763.03
5000				0.13				8				13292.22
5000				0.13				9				15020.21
5000				0.13				10				16972.84
5000				0.14				1				5700.00
5000				0.14				2				6498.00
5000				0.14				3				7407.72
5000				0.14				4				8444.80
5000				0.14				5				9627.07
5000				0.14				6				10974.86
5000				0.14				7				12511.34
5000				0.14				8				14262.93
5000				0.14				9				16259.74
5000				0.14				10				18536.11
5000				0.15				1				5750.00
5000				0.15				2				6612.50
5000				0.15				3				7604.37
5000				0.15				4				8745.03
5000				0.15				5				10056.79
5000				0.15				6				11565.30
5000				0.15				7				13300.10
5000				0.15				8				15295.11
5000				0.15				9				17589.38
5000				0.15				10				20227.79
5000				0.16				1				5800.00
5000				0.16				2				6728.00
5000				0.16				3				7804.48
5000				0.16				4				9053.20
5000				0.16				5				10501.71
5000				0.16				6				12181.98
5000				0.16				7				14131.10
5000				0.16				8				16392.07
5000				0.16				9				19014.81
5000				0.16				10				22057.18
5000				0.17				1				5850.00
5000				0.17				2				6844.50
5000				0.17				3				8008.06
5000				0.17				4				9369.44
5000				0.17				5				10962.24
5000				0.17				6				12825.82
5000				0.17				7				15006.21
5000				0.17				8				17557.27
5000				0.17				9				20542.00
5000				0.17				10				24034.14
5000				0.18				1				5900.00
5000				0.18				2				6962.00
5000				0.18				3				8215.16
5000				0.18				4				9693.89
5000				0.18				5				11438.79
5000				0.18				6				13497.77
5000				0.18				7				15927.37
5000				0.18				8				18794.30
5000				0.18				9				22177.27
5000				0.18				10				26169.18
5000				0.19				1				5950.00
5000				0.19				2				7080.50
5000				0.19				3				8425.80
5000				0.19				4				10026.70
5000				0.19				5				11931.77
5000				0.19				6				14198.80
5000				0.19				7				16896.58
5000				0.19				8				20106.93
5000				0.19				9				23927.24
5000				0.19				10				28473.42
6000				0.10				1				6600.00
6000				0.10				2				7260.00
6000				0.10				3				7986.00
6000				0.10				4				8784.60
6000				0.10				5				9663.06
6000				0.10				6				10629.37
6000				0.10				7				11692.30
6000				0.10				8				12861.53
6000				0.10				9				14147.69
6000				0.10				10				15562.45
6000				0.11				1				6660.00
6000				0.11				2				7392.60
6000				0.11				3				8205.79
6000				0.11				4				9108.42
6000				0.11				5				10110.35
6000				0.11				6				11222.49
6000				0.11				7				12456.96
6000				0.11				8				13827.23
6000				0.11				9				15348.22
6000				0.11				10				17036.53
6000				0.12				1				6720.00
6000				0.12				2				7526.40
6000				0.12				3				8429.57
6000				0.12				4				9441.12
6000				0.12				5				10574.05
6000				0.12				6				11842.94
6000				0.12				7				13264.09
6000				0.12				8				14855.78
6000				0.12				9				16638.47
6000				0.12				10				18635.09
6000				0.13				1				6780.00
6000				0.13				2				7661.40
6000				0.13				3				8657.38
6000				0.13				4				9782.84
6000				0.13				5				11054.61
6000				0.13				6				12491.71
6000				0.13				7				14115.63
6000				0.13				8				15950.67
6000				0.13				9				18024.25
6000				0.13				10				20367.40
6000				0.14				1				6840.00
6000				0.14				2				7797.60
6000				0.14				3				8889.26
6000				0.14				4				10133.76
6000				0.14				5				11552.49
6000				0.14				6				13169.84
6000				0.14				7				15013.61
6000				0.14				8				17115.52
6000				0.14				9				19511.69
6000				0.14				10				22243.33
6000				0.15				1				6900.00
6000				0.15				2				7935.00
6000				0.15				3				9125.25
6000				0.15				4				10494.04
6000				0.15				5				12068.14
6000				0.15				6				13878.36
6000				0.15				7				15960.12
6000				0.15				8				18354.14
6000				0.15				9				21107.26
6000				0.15				10				24273.35
6000				0.16				1				6960.00
6000				0.16				2				8073.60
6000				0.16				3				9365.38
6000				0.16				4				10863.84
6000				0.16				5				12602.05
6000				0.16				6				14618.38
6000				0.16				7				16957.32
6000				0.16				8				19670.49
6000				0.16				9				22817.77
6000				0.16				10				26468.61
6000				0.17				1				7020.00
6000				0.17				2				8213.40
6000				0.17				3				9609.68
6000				0.17				4				11243.32
6000				0.17				5				13154.69
6000				0.17				6				15390.99
6000				0.17				7				18007.45
6000				0.17				8				21068.72
6000				0.17				9				24650.40
6000				0.17				10				28840.97
6000				0.18				1				7080.00
6000				0.18				2				8354.40
6000				0.18				3				9858.19
6000				0.18				4				11632.67
6000				0.18				5				13726.55
6000				0.18				6				16197.32
6000				0.18				7				19112.84
6000				0.18				8				22553.16
6000				0.18				9				26612.72
6000				0.18				10				31403.01
6000				0.19				1				7140.00
6000				0.19				2				8496.60
6000				0.19				3				10110.95
6000				0.19				4				12032.04
6000				0.19				5				14318.12
6000				0.19				6				17038.57
6000				0.19				7				20275.89
6000				0.19				8				24128.31
6000				0.19				9				28712.69
6000				0.19				10				34168.10
7000				0.10				1				7700.00
7000				0.10				2				8470.00
7000				0.10				3				9317.00
7000				0.10				4				10248.70
7000				0.10				5				11273.57
7000				0.10				6				12400.93
7000				0.10				7				13641.02
7000				0.10				8				15005.12
7000				0.10				9				16505.63
7000				0.10				10				18156.20
7000				0.11				1				7770.00
7000				0.11				2				8624.70
7000				0.11				3				9573.42
7000				0.11				4				10626.49
7000				0.11				5				11795.41
7000				0.11				6				13092.90
7000				0.11				7				14533.12
7000				0.11				8				16131.76
7000				0.11				9				17906.26
7000				0.11				10				19875.95
7000				0.12				1				7840.00
7000				0.12				2				8780.80
7000				0.12				3				9834.50
7000				0.12				4				11014.64
7000				0.12				5				12336.39
7000				0.12				6				13816.76
7000				0.12				7				15474.77
7000				0.12				8				17331.74
7000				0.12				9				19411.55
7000				0.12				10				21740.94
7000				0.13				1				7910.00
7000				0.13				2				8938.30
7000				0.13				3				10100.28
7000				0.13				4				11413.32
7000				0.13				5				12897.05
7000				0.13				6				14573.66
7000				0.13				7				16468.24
7000				0.13				8				18609.11
7000				0.13				9				21028.29
7000				0.13				10				23761.97
7000				0.14				1				7980.00
7000				0.14				2				9097.20
7000				0.14				3				10370.81
7000				0.14				4				11822.72
7000				0.14				5				13477.90
7000				0.14				6				15364.81
7000				0.14				7				17515.88
7000				0.14				8				19968.10
7000				0.14				9				22763.64
7000				0.14				10				25950.55
7000				0.15				1				8050.00
7000				0.15				2				9257.50
7000				0.15				3				10646.12
7000				0.15				4				12243.04
7000				0.15				5				14079.50
7000				0.15				6				16191.43
7000				0.15				7				18620.14
7000				0.15				8				21413.16
7000				0.15				9				24625.13
7000				0.15				10				28318.90
7000				0.16				1				8120.00
7000				0.16				2				9419.20
7000				0.16				3				10926.27
7000				0.16				4				12674.48
7000				0.16				5				14702.39
7000				0.16				6				17054.77
7000				0.16				7				19783.54
7000				0.16				8				22948.90
7000				0.16				9				26620.73
7000				0.16				10				30880.05
7000				0.17				1				8190.00
7000				0.17				2				9582.30
7000				0.17				3				11211.29
7000				0.17				4				13117.21
7000				0.17				5				15347.14
7000				0.17				6				17956.15
7000				0.17				7				21008.69
7000				0.17				8				24580.17
7000				0.17				9				28758.80
7000				0.17				10				33647.80
7000				0.18				1				8260.00
7000				0.18				2				9746.80
7000				0.18				3				11501.22
7000				0.18				4				13571.44
7000				0.18				5				16014.30
7000				0.18				6				18896.88
7000				0.18				7				22298.32
7000				0.18				8				26312.01
7000				0.18				9				31048.18
7000				0.18				10				36636.85
7000				0.19				1				8330.00
7000				0.19				2				9912.70
7000				0.19				3				11796.11
7000				0.19				4				14037.37
7000				0.19				5				16704.48
7000				0.19				6				19878.33
7000				0.19				7				23655.21
7000				0.19				8				28149.70
7000				0.19				9				33498.14
7000				0.19				10				39862.79
8000				0.10				1				8800.00
8000				0.10				2				9680.00
8000				0.10				3				10648.00
8000				0.10				4				11712.80
8000				0.10				5				12884.08
8000				0.10				6				14172.49
8000				0.10				7				15589.74
8000				0.10				8				17148.71
8000				0.10				9				18863.58
8000				0.10				10				20749.94
8000				0.11				1				8880.00
8000				0.11				2				9856.80
8000				0.11				3				10941.05
8000				0.11				4				12144.56
8000				0.11				5				13480.47
8000				0.11				6				14963.32
8000				0.11				7				16609.28
8000				0.11				8				18436.30
8000				0.11				9				20464.30
8000				0.11				10				22715.37
8000				0.12				1				8960.00
8000				0.12				2				10035.20
8000				0.12				3				11239.42
8000				0.12				4				12588.15
8000				0.12				5				14098.73
8000				0.12				6				15790.58
8000				0.12				7				17685.45
8000				0.12				8				19807.71
8000				0.12				9				22184.63
8000				0.12				10				24846.79
8000				0.13				1				9040.00
8000				0.13				2				10215.20
8000				0.13				3				11543.18
8000				0.13				4				13043.79
8000				0.13				5				14739.48
8000				0.13				6				16655.61
8000				0.13				7				18820.84
8000				0.13				8				21267.55
8000				0.13				9				24032.34
8000				0.13				10				27156.54
8000				0.14				1				9120.00
8000				0.14				2				10396.80
8000				0.14				3				11852.35
8000				0.14				4				13511.68
8000				0.14				5				15403.32
8000				0.14				6				17559.78
8000				0.14				7				20018.15
8000				0.14				8				22820.69
8000				0.14				9				26015.59
8000				0.14				10				29657.77
8000				0.15				1				9200.00
8000				0.15				2				10580.00
8000				0.15				3				12167.00
8000				0.15				4				13992.05
8000				0.15				5				16090.86
8000				0.15				6				18504.49
8000				0.15				7				21280.16
8000				0.15				8				24472.18
8000				0.15				9				28143.01
8000				0.15				10				32364.46
8000				0.16				1				9280.00
8000				0.16				2				10764.80
8000				0.16				3				12487.17
8000				0.16				4				14485.11
8000				0.16				5				16802.73
8000				0.16				6				19491.17
8000				0.16				7				22609.76
8000				0.16				8				26227.32
8000				0.16				9				30423.69
8000				0.16				10				35291.48
8000				0.17				1				9360.00
8000				0.17				2				10951.20
8000				0.17				3				12812.90
8000				0.17				4				14991.10
8000				0.17				5				17539.58
8000				0.17				6				20521.31
8000				0.17				7				24009.94
8000				0.17				8				28091.63
8000				0.17				9				32867.20
8000				0.17				10				38454.63
8000				0.18				1				9440.00
8000				0.18				2				11139.20
8000				0.18				3				13144.26
8000				0.18				4				15510.22
8000				0.18				5				18302.06
8000				0.18				6				21596.43
8000				0.18				7				25483.79
8000				0.18				8				30070.87
8000				0.18				9				35483.63
8000				0.18				10				41870.68
8000				0.19				1				9520.00
8000				0.19				2				11328.80
8000				0.19				3				13481.27
8000				0.19				4				16042.71
8000				0.19				5				19090.83
8000				0.19				6				22718.09
8000				0.19				7				27034.52
8000				0.19				8				32171.08
8000				0.19				9				38283.59
8000				0.19				10				45557.47
9000				0.10				1				9900.00
9000				0.10				2				10890.00
9000				0.10				3				11979.00
9000				0.10				4				13176.90
9000				0.10				5				14494.59
9000				0.10				6				15944.05
9000				0.10				7				17538.45
9000				0.10				8				19292.30
9000				0.10				9				21221.53
9000				0.10				10				23343.68
9000				0.11				1				9990.00
9000				0.11				2				11088.90
9000				0.11				3				12308.68
9000				0.11				4				13662.63
9000				0.11				5				15165.52
9000				0.11				6				16833.73
9000				0.11				7				18685.44
9000				0.11				8				20740.84
9000				0.11				9				23022.33
9000				0.11				10				25554.79
9000				0.12				1				10080.00
9000				0.12				2				11289.60
9000				0.12				3				12644.35
9000				0.12				4				14161.67
9000				0.12				5				15861.08
9000				0.12				6				17764.40
9000				0.12				7				19896.13
9000				0.12				8				22283.67
9000				0.12				9				24957.71
9000				0.12				10				27952.63
9000				0.13				1				10170.00
9000				0.13				2				11492.10
9000				0.13				3				12986.07
9000				0.13				4				14674.26
9000				0.13				5				16581.92
9000				0.13				6				18737.57
9000				0.13				7				21173.45
9000				0.13				8				23926.00
9000				0.13				9				27036.38
9000				0.13				10				30551.11
9000				0.14				1				10260.00
9000				0.14				2				11696.40
9000				0.14				3				13333.90
9000				0.14				4				15200.64
9000				0.14				5				17328.73
9000				0.14				6				19754.75
9000				0.14				7				22520.42
9000				0.14				8				25673.28
9000				0.14				9				29267.54
9000				0.14				10				33364.99
9000				0.15				1				10350.00
9000				0.15				2				11902.50
9000				0.15				3				13687.87
9000				0.15				4				15741.06
9000				0.15				5				18102.21
9000				0.15				6				20817.55
9000				0.15				7				23940.18
9000				0.15				8				27531.21
9000				0.15				9				31660.89
9000				0.15				10				36410.02
9000				0.16				1				10440.00
9000				0.16				2				12110.40
9000				0.16				3				14048.06
9000				0.16				4				16295.75
9000				0.16				5				18903.07
9000				0.16				6				21927.57
9000				0.16				7				25435.98
9000				0.16				8				29505.73
9000				0.16				9				34226.65
9000				0.16				10				39702.92
9000				0.17				1				10530.00
9000				0.17				2				12320.10
9000				0.17				3				14414.52
9000				0.17				4				16864.98
9000				0.17				5				19732.03
9000				0.17				6				23086.48
9000				0.17				7				27011.18
9000				0.17				8				31603.08
9000				0.17				9				36975.60
9000				0.17				10				43261.46
9000				0.18				1				10620.00
9000				0.18				2				12531.60
9000				0.18				3				14787.29
9000				0.18				4				17449.00
9000				0.18				5				20589.82
9000				0.18				6				24295.99
9000				0.18				7				28669.27
9000				0.18				8				33829.73
9000				0.18				9				39919.08
9000				0.18				10				47104.52
9000				0.19				1				10710.00
9000				0.19				2				12744.90
9000				0.19				3				15166.43
9000				0.19				4				18048.05
9000				0.19				5				21477.18
9000				0.19				6				25557.85
9000				0.19				7				30413.84
9000				0.19				8				36192.47
9000				0.19				9				43069.04
9000				0.19				10				51252.15
10000				0.10				1				11000.00
10000				0.10				2				12100.00
10000				0.10				3				13310.00
10000				0.10				4				14641.00
10000				0.10				5				16105.10
10000				0.10				6				17715.61
10000				0.10				7				19487.17
10000				0.10				8				21435.89
10000				0.10				9				23579.48
10000				0.10				10				25937.42
10000				0.11				1				11100.00
10000				0.11				2				12321.00
10000				0.11				3				13676.31
10000				0.11				4				15180.70
10000				0.11				5				16850.58
10000				0.11				6				18704.15
10000				0.11				7				20761.60
10000				0.11				8				23045.38
10000				0.11				9				25580.37
10000				0.11				10				28394.21
10000				0.12				1				11200.00
10000				0.12				2				12544.00
10000				0.12				3				14049.28
10000				0.12				4				15735.19
10000				0.12				5				17623.42
10000				0.12				6				19738.23
10000				0.12				7				22106.81
10000				0.12				8				24759.63
10000				0.12				9				27730.79
10000				0.12				10				31058.48
10000				0.13				1				11300.00
10000				0.13				2				12769.00
10000				0.13				3				14428.97
10000				0.13				4				16304.74
10000				0.13				5				18424.35
10000				0.13				6				20819.52
10000				0.13				7				23526.05
10000				0.13				8				26584.44
10000				0.13				9				30040.42
10000				0.13				10				33945.67
10000				0.14				1				11400.00
10000				0.14				2				12996.00
10000				0.14				3				14815.44
10000				0.14				4				16889.60
10000				0.14				5				19254.15
10000				0.14				6				21949.73
10000				0.14				7				25022.69
10000				0.14				8				28525.86
10000				0.14				9				32519.49
10000				0.14				10				37072.21
10000				0.15				1				11500.00
10000				0.15				2				13225.00
10000				0.15				3				15208.75
10000				0.15				4				17490.06
10000				0.15				5				20113.57
10000				0.15				6				23130.61
10000				0.15				7				26600.20
10000				0.15				8				30590.23
10000				0.15				9				35178.76
10000				0.15				10				40455.58
10000				0.16				1				11600.00
10000				0.16				2				13456.00
10000				0.16				3				15608.96
10000				0.16				4				18106.39
10000				0.16				5				21003.42
10000				0.16				6				24363.96
10000				0.16				7				28262.20
10000				0.16				8				32784.15
10000				0.16				9				38029.61
10000				0.16				10				44114.35
10000				0.17				1				11700.00
10000				0.17				2				13689.00
10000				0.17				3				16016.13
10000				0.17				4				18738.87
10000				0.17				5				21924.48
10000				0.17				6				25651.64
10000				0.17				7				30012.42
10000				0.17				8				35114.53
10000				0.17				9				41084.00
10000				0.17				10				48068.28
10000				0.18				1				11800.00
10000				0.18				2				13924.00
10000				0.18				3				16430.32
10000				0.18				4				19387.78
10000				0.18				5				22877.58
10000				0.18				6				26995.54
10000				0.18				7				31854.74
10000				0.18				8				37588.59
10000				0.18				9				44354.54
10000				0.18				10				52338.36
10000				0.19				1				11900.00
10000				0.19				2				14161.00
10000				0.19				3				16851.59
10000				0.19				4				20053.39
10000				0.19				5				23863.54
10000				0.19				6				28397.61
10000				0.19				7				33793.15
10000				0.19				8				40213.85
10000				0.19				9				47854.49
10000				0.19				10				56946.84
*/
