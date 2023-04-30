import unittest
import datetime

class DatePattern:

    def __init__(self, year, month, day):
        self.year  = year
        self.month = month
        self.day   = day

    def matches(self, date):
        return ((self.year and self.year == date.year or True) and
                 self.month == date.month and
                 self.day   == date.day)

class DatePatternTest(unittest.TestCase):
	
	def testMatchesYearAndMonthAsWildCards(self):
		p = DatePattern(0, 0, 1)
		d = datetime.date(2004, 10, 1)
		self.failUnless(p.matches(d))     

	def testMatchesWeekday(self):
	    p = DatePattern(0, 0, 0, 2) # 2 is Wednesday
	    d = datetime.date(2004, 9, 29)
	    self.failUnless(p.matches(d))		

	def testMatchesYearAsWildCard(self):
	    p = DatePattern(0, 4, 10)
	    d = datetime.date(2005, 4, 10)
	    self.failUnless(p.matches(d))	    

if __name__ == '__main__':
    unittest.main()   