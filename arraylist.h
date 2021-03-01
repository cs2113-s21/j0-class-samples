
//data elements
typedef struct ArrayListInt{
  int len; //number of items in the array
  int size; // current size of array
  int * array;

}alist_t;

//interface elements
alist_t * new_al();
void del_al(alist_t * al);

//return 0/1 success failure if out of bounds
int get(alist_t * al, int idx, int * dest); //store what's got at dest
int set(alist_t * al, int idx, int val); //set al_list[i] to val

//return 0/1 success failure
int pop_tail(alist_t * al, int * dest); //store what's poped at dest
void push_tail(alist_t * al, int val); //add val to the tail

//internal function
void _expand(alist_t * al); //expand the array

//other usefule functions
void print_al(alist_t * al);

/* typedef struct ArrayListFloats{ */
/*   int len; */
/*   int size; */
/*   float * array; */
/* } alist_f_t; */

/* typedef struct List{ */
/*   //????? */
/* } */

/* //ArrayList, LinkedList, CircularArrayLists, SkipLists, Trees ... */

 
