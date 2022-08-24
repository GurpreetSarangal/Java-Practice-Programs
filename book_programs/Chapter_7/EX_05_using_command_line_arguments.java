/** java EX_05_using_command_line_arguments These are the command line arguments */
class EX_05_using_command_line_arguments{
    public static void main(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println("args [ "+i+" ] = "+ args[i]);
        }
    }
}