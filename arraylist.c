#include <stdio.h>
#include <stdlib.h>

#include "arraylist.h"

#define AL_INIT_SIZE 16


int main(){

  alist_t * al = new_al();
  
  for(int i=0;i<40;i++)
    push_tail(al,i);

  print_al(al);
  printf("---------------\n");

  set(al,10,-20);
  set(al,30,-20);
  
  print_al(al);
  printf("---------------\n");
  
  int v;
  get(al,10,&v);
  printf("al[10]=%d\n",v);
  get(al,20,&v);
  printf("al[20]=%d\n",v);
  get(al,30,&v);
  printf("al[30]=%d\n",v);

  del_al(al);
}

alist_t * new_al(){

  alist_t * al = malloc(sizeof(alist_t));
  al->size = AL_INIT_SIZE;
  al->len = 0;
  al->array = calloc(sizeof(int),al->size);

  return al;
}

void del_al(alist_t * al){
  free(al->array);
  free(al);
}

int get(alist_t * al, int idx, int * dest){
  if(idx >= 0 && idx < al->len){
    *dest=al->array[idx];
    return 1;
  }
  return 0;
}

int set(alist_t * al, int idx, int val){
  if(idx >= 0 && idx < al->len){
    al->array[idx] = val;
    return 1;
  }
  return 0;
}

void push_tail(alist_t * al, int val){
  if(al->len == al->size){
    _expand(al);
  }
  al->array[al->len]=val;
  al->len++;
}

void _expand(alist_t * al){
  int * old_array = al->array;
  al->array = calloc(sizeof(int),al->size*2);

  for(int i=0;i<al->size;i++){
    al->array[i] = old_array[i];
  }
  al->size *= 2;
  free(old_array);
}

int pop_tail(alist_t *al, int * dest){
  if(al->len > 0){
    *dest = al->array[al->len-1];
    al->len--;
    return 1;
  }
  return 0;
}



void print_al(alist_t * al){
  printf("[");
  for(int i=0;i<al->len;i++){
    int v;
    get(al,i,&v);
    printf("%d",v);
    if(i<al->len-1)
      printf(",");
  }
  printf("]\n");
}
