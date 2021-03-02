import sys
import re
import operator

storyFileName = input("Story file name: ")
while storyFileName == '':
	storyFileName = input("Invalid Entry. Story file name: ")
skipFileName = input("Skip word file name: ")
while skipFileName == '':
	skipFileName = input("Invalid Entry. Skip word file name: ")

with open(storyFileName, 'r') as storyFile:
	storyFile = storyFile.read()
with open(skipFileName, 'r') as skipFile:
	skipFile = skipFile.read()
storyFile = storyFile.lower()
skipFile = skipFile.lower()
storyFile = storyFile.replace('.', '')
storyFile = storyFile.replace('\n', ' ')
storyFile = storyFile.replace('?', '')
storyFile = storyFile.replace('\t', ' ')
storyFile = storyFile.replace('!', '')
storyFile = storyFile.replace(',', '')
storyFile = storyFile.replace(';', '')
storyFile = storyFile.replace(':', '')
storyFile = storyFile.replace('\'', '')
storyFile = storyFile.replace('\"', '')
storyFile = storyFile.replace('  ', ' ')
storyFile = storyFile.replace('   ', ' ')

storyList = []
storyList = storyFile.split()
skipList = []
skipList = skipFile.split(',')

for i in storyList[:]:
	if i in skipList:
		storyList.remove(i)
print("Skip Words: " , skipList)

myDict = {}
for i in range(len(storyList)-1):
	temp = storyList[i] + ' ' + storyList[i+1]
	if temp in myDict:
		myDict[temp] += 1
	else:
		myDict[temp] = 1
max1 = max(myDict.items(), key = operator.itemgetter(1))[0]
print("(\'",max1,"\',",myDict[max1],")")
myDict[max1] = 0
max1 = max(myDict.items(), key = operator.itemgetter(1))[0]
print("(\'",max1,"\',",myDict[max1],")")
myDict[max1] = 0
max1 = max(myDict.items(), key = operator.itemgetter(1))[0]
print("(\'",max1,"\',",myDict[max1],")")
myDict[max1] = 0
max1 = max(myDict.items(), key = operator.itemgetter(1))[0]
print("(\'",max1,"\',",myDict[max1],")")
myDict[max1] = 0
max1 = max(myDict.items(), key = operator.itemgetter(1))[0]
print("(\'",max1,"\',",myDict[max1],")")
myDict[max1] = 0
