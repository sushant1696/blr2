PartTimeEmployee(){
	echo "enter part time Employee name  "
	read name
	echo "Part time Employee name is :$name"
	echo "enter the per hour wage"
	read wage
	totalhour=4
	PertTimeWage=$(($wage*$totalhour))
	echo "total wage is = $PertTimeWage"
}
PartTimeEmployee