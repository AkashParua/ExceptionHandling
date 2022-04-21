public class InvalidBoxException extends Exception{
    int trigger_value ;                      //exception where the trigger value describes the reason for the exception
            InvalidBoxException(int i)       //0 when one or more values are <= 0 ,1 if all the dimensions are unequal , 2 if vertical lines are unequal , 3 if horizontal lines are unequal
            {
                this.trigger_value = i;
            }
}
