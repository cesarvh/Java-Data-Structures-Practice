import time
import math
import os

def takeAShot(interval, numShots):
	""" 
	Function that tells you when to take a shot based on a given interval.
	@param interval: The time interval you want to take a shot in, in minutes
	@param numShots: The number of shots you want to take 
	Linux only, I think.
	"""
	for shot in range(numShots):
		flag = False
		start = time.time()
		while (flag == False):
			end = time.time()
			if (math.floor(end - start) == 60.0 * interval):
				flag = True
		os.system('say "Time to take a shot"')

