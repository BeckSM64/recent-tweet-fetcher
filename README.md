General ReadMe Info:

- This command line tool for twitter was created by Shane Harrington on May 21, 2017.

- This program is a command line tool for twitter. 
It accepts a twitter username and a number as arguments and
then displays the number specified of the most recent tweets
for the public account passed as an argument.

- This program is intended to be run with the .bat file. It of course could be run with
the jar directly as well.

- The source files in the eclipse project are also included in a zip file so the code can
be viewed.

Assumptions:

1. While writing this program, I had to make a couple of asssumptions. The specifications
said that the program should be able to be run from the command line in a format
like this: "my_tool @gofooda 10". I wrote this program in java and exported to a runnable
jar file. Because of this, the program would be run from the command line like so:
"java -jar my_tool.jar @gofooda 10". I was not sure if this was okay, so I created a
batch file to run the jar file so the proper format could be used.

2. I also made the assumption that since this program is looking for the most recent tweets,
it probably would not expect to display tweets that are not within the first page of
the results. It can only retrieve up to the 20 most recent tweets.