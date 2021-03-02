////////////////////////////////////////////////////////////
//  CSCE 3193
//  Spring 2019
//  Assignment 8
//  Name: Morgan Maness
////////////////////////////////////////////////////////////

//  You must complete the implementation of the six functions below.
//  In all cases where it is given that the arguments to a function are
//  numbers (or an array of numbers), you can assume that the correct types
//  of values are passed as arguments and don't have to check for the wrong
//  types or invalid input in the script used for testing.

////////////////////////////////////////////////////////////
//  Recursion
function reverseArray(arr) {
	var newArr = [];
	if(arr.length==0) {
		 return newArr;
	}
	else {
			return newArr.concat(reverseArray(arr.slice(1, arr.length)), arr[0]);
	}

}

function findMin(a) {
	var min = a[0];
	if(a.length==1)
	{
		return min;
	}
	else if(a[1]<min)
	{
		return findMin(a.slice(1, a.length));
	}
	else {
		a[1]=a[0];
		return findMin(a.slice(1, a.length));
	}
}

function stringFromArrays(arr1, arr2) {
	if(arr1.length==1)
	{
		arr1[0]+=arr2[0];
		return arr1[0];
	}
	else
	{
		arr1[1] = arr1[0] + arr2[0] + arr1[1];
		return stringFromArrays(arr1.slice(1, arr1.length), arr2.slice(1, arr2.length));
	}
}

////////////////////////////////////////////////////////////
//  Higher order functions

function applyToArray(a) {
		function forEach(f)
		{
			var arr = []
			for (var i = 0; i < a.length; i++)
			{
				arr[i] = f(a[i]);
			}
			return arr;
		}
		return forEach;
}


function computeMaxArr(f1, f2) {
	var check = function(arr) {
		var newArr = [];
		if(arr.length==0) {
			 return newArr;
		}
		else {
			if(f1(arr[0]) > f2(arr[0])){
				return newArr.concat(f1(arr[0]), check(arr.slice(1, arr.length)));
			}
			else{
				return newArr.concat(f2(arr[0]), check(arr.slice(1, arr.length)));
			}
		}
	}
	return check;
}


////////////////////////////////////////////////////////////
//  Common closure

function makeClosure() {
	var counter = 0;
	var arr = [];
	f1 = function(num1, num2){
		if(counter < 3){
			arr.push(num1+num2);
		}
		return arr;
	};
	f2 = function(){
		counter++;
		return;
	};
	var rarr = [f1, f2];
	return(rarr);
}

////////////////////////////////////////////////////////////
//  Auxiliary functions (used for testing)

function mult4(i) {
	return i*4;
}

function add2(j) {
	return j+2;
}

function square(k) {
	return k*k;
}
