CheckPresentAbsent(){
rand=$(($RANDOM%2))
if(($rand<1))
then
echo "Sorry the Employee is absent"
else
echo "Yes Employee is present"
fi
echo "$rand"
}
CheckPresentAbsent