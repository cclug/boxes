int len = args[0] as int

int[][] view = new int[len][len]

def drawBox = { int x1, y1, x2, y2 ->
  (x1..x2).each { x ->
     //draw first line
     view[y1][x] = 1
     //draw last line
     view[y2][x] = 1
  }
  (y1..y2).each { y ->
     //draw first bar
     view[y][x1] = 1
     //draw last bar
     view[y][x2] = 1
  }
}

def printBox = {
  (0..len-1).each { x-> 
    (0..len-1).each { y ->
      print view[x][y] ? '*' : ' '
    }
      println ''
  }
}

int n = 0

while (n < len/2) {
  drawBox(0+n, 0+n, len-1-n, len-1-n)
  n+=2
}

//drawBox(2, 2, len-3, len-3)

//drawBox(0, 0, len-1, len-1)
//drawBox(2, 2, len-1-2, len-1-2)

printBox()

