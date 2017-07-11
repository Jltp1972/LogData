import java.util.Date;
import java.util.Stack;

import javax.xml.soap.Node;


public class LocationTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    static logLocation root; // the only data field in Tree
    private logLocation left;    // left child (left subtree)
    private logLocation right;   // right child (right subtree)

    public LocationTree()							//constructor
    	{root = null;}							//empty to start

  //  public void search(String data)				//search for name(string)
 //   {
 //   	logLocation current = root;
//    	int result = data.compareTo(current.sData); 

//    	if (result == 0) { 
//    		System.out.println(current.sData + " is #" + current.iData + " on the list.");
//    		return;}
    	
 //   	else {
//    	while (result != 0){
    		
//    		if (result < 0)		//less than go left
//    			{current = current.left;
//    			if (current == null)
//    				{System.out.println(data + " is not in the list.");
//    				return;}
//    			result = data.compareTo(current.sData); }
 //   			
 //   		else if (result > 0)  										//greater than go right
 //   			{
 //   			current = current.right;
 //   			if (current == null)
//					{System.out.println(data + " is not in the list.");
//					return;}
 //   			result = data.compareTo(current.sData); }
  //  		else
   // 		result = data.compareTo(current.sData);	}}

//    	System.out.println(current.sData + " is #" + current.iData + " on the list.");
//    }
    
    
  //  }

    public static void addNewLoc(String addr, String cty, String ste, String nme, String phn, String dte, String sts, String nbr, String nte, String eml)
    {	
//    	long datekey = (new Date().getTime());
		
    	logLocation newLoc = new logLocation(addr, cty, ste, nme, phn, dte, sts, nbr, nte, eml);
    	long key = locator.getkey(addr, cty, ste);
    	if (key == 99999){
    		System.out.println("Address not correct.");
    	}
    	else {
    	logLocation parent;
    	if(root == null){
    		root = newLoc;}
	
    	else {
    		
    		logLocation current = root;
//    		parent = current;
//    		result = data.compareTo(current.sData);

  //  			while(result != 0) {
    				parent = current;
  //  				result = data.compareTo(current.sData);
    				
    				if( key < parent.key ) {

    					if (parent.left == null) {
    						parent.left = newLoc;
    						current = newLoc;
    					 }
    				    else
    				    	current = parent.left;
    				}
    				
    				else if (key > parent.key){
    					parent = current;
    					current = current.right;
    					
    				    if(parent.right == null) {
    						parent.right = newLoc;
    						current = newLoc;
    						}
    				    else
    				    	current = parent.right;
    				 }
    				
    				else if (key == parent.key) {							//should never hit this
    					System.out.println("Match");
    					System.out.println("Parent key: " + parent.key);
    					System.out.println("This key: " + key);
    					}
    				
    				else {											//just in case
    					System.out.println("Error");}
    				}  						
    	return;
    			}}
 
    
    public void searchaddress (String a) {
    	logLocation current = root;
    	if (current.address.equals(a)) {
    		System.out.println("Address was found in root position.");}
    	else {
    		
    	}
    	
    	
    
    }
    
    
public void searchkey (logLocation localRoot, long a) {
	
	if (localRoot != null) {
	if (localRoot.left != null) {
		if (localRoot.left.key == a) {
			System.out.println("Location found.");
			System.out.println("Name :" + localRoot.left.ownerName);
			System.out.println("Address :" + localRoot.left.address);
			System.out.println("Date : " + localRoot.left.locdate);
			System.out.println("Status : " + localRoot.left.status);
			System.out.println("Phone : " + localRoot.left.phoneNumber);}
		  else if (localRoot.key > a) {
				searchkey(localRoot.left, a);}
		  else { 
			    searchkey(localRoot.right, a);}
		}
		
	
		if (localRoot.right != null) {
			if (localRoot.right.key == a) {
				System.out.println("Location found.");
				System.out.println("Name :" + localRoot.right.ownerName);
				System.out.println("Address :" + localRoot.right.address);
				System.out.println("Date : " + localRoot.right.locdate);
				System.out.println("Status : " + localRoot.right.status);
				System.out.println("Phone : " + localRoot.right.phoneNumber);}
			  else if (localRoot.key < a) {
					searchkey(localRoot.right, a);}
			  else { 
				    searchkey(localRoot.left, a);}
			  
		}
		else {
			System.out.println("Key not found.");}
	}
}
    
    
   
    
    
 //   private void preOrder(Node localRoot)
 //   {
 //   if(localRoot != null)
 //   {
 //   System.out.print(localRoot.iData + " ");
 //   preOrder(localRoot.left);
 //   preOrder(localRoot.right);
//    }

//Method to display the order nodes are visited in each type of travaersal


private void print(logLocation localRoot)
{
if(localRoot != null)
{
System.out.print(localRoot.locdate + " " + localRoot.ownerName + " " + localRoot.status);
print(localRoot.left);
print(localRoot.right);
}
}

//Method to print a physical representation of the tree
public void display()
{
Stack globalStack = new Stack();
globalStack.push(root);
int nBlanks = 32;
boolean isRowEmpty = false;
System.out.println(
"............................................................................................................");
while(isRowEmpty==false)
{
	Stack localStack = new Stack();
	isRowEmpty = true;
	for(int j=0; j<nBlanks; j++)
	System.out.print(' ');
	while(globalStack.isEmpty()==false)
	{
	logLocation temp = (logLocation)globalStack.pop();
	if(temp != null)
	{
	System.out.print(temp.key);
	localStack.push(temp.left);
	localStack.push(temp.right);
	if(temp.left != null ||
	temp.right != null)
	isRowEmpty = false;
	}
	else
	{
	System.out.print(" * ");
	localStack.push(null);
	localStack.push(null);
	}
	for(int j=0; j<nBlanks*2-2; j++)
	System.out.print(" ");
	} // end while globalStack not empty
	System.out.println();
	nBlanks /= 2;
	while(localStack.isEmpty()==false)
	globalStack.push( localStack.pop() );
	} // end while isRowEmpty is false
	System.out.println(
	"............................................................................................................");
}
}
    


