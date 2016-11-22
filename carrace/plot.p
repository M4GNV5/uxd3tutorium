set terminal svg enhanced size 700 400
set samples 1001
set border 31 linewidth .3
set key left top
set xlabel "Time (s)"
set key autotitle columnheader

set output "distance.svg"
set ylabel "Distance (m)"
plot "distance.dat" i 0 u 1:2 with lines title columnheader(1),\
     "distance.dat" i 1 u 1:2 with lines title columnheader(1),\
     "distance.dat" i 2 u 1:2 with lines title columnheader(1)
     
set output "speed.svg"
set ylabel "Speed (m/s)"
plot "speed.dat" i 0 u 1:2 w lines title columnheader(1),\
     "speed.dat" i 1 u 1:2 w lines title columnheader(1),\
     "speed.dat" i 2 u 1:2 w lines title columnheader(1)
     

