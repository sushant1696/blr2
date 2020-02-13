
CheckPresentAbsent(){
rand=$(($RANDOM%2))
if(($rand<1))
then
echo "Sory Employee is absent"
else
echo "Employee is present"
fi
echo "$rand"
}
CheckPresentAbsent