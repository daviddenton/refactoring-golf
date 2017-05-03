 Hole1 - Par 3:
  - replace == with equals (fix all inspections)
  - invert if
  - remove redundant else
   
 Hole2 - Par 7:
  - rename Pair to Money + variable names
  - replace A with Integer
  - replace B with String
  - safe delete A
  - safe delete B
  - rename number to value
  - rename string to currency
 
 Hole3 - Par 5:
 - merge loops (MANUAL 2)
 - extract plus method + parameter name + visibility
 - inline total
 - move plus method to Money

 Hole4 - Par 6:
 - replace first.currency total.currency (so can extract minus) (MANUAL 2)
 - extract minus method (keep original sig) + visibility + param name
 - move minus method to Money
 - extract Money to big boy
 - replace constructor with factory money()

 Hole5 - Par 10:
 - extract TaxRate parameter object (from constructor)
 - create field taxRate
 - inline percent in calc
 - remove field percent (NOT SAFE DELETE!)
 - replace first.currency total.currency (so can extract minus) (MANUAL 2)
 - extract method apply
 - extract parameter taxRate
 - move apply method to TaxRate
 - replace constructor with factory

 Hole6 - Par 7:
 - replace loop with reduce (MANUAL 6)
 - inline getPercent() in TaxRate

Total: 37
