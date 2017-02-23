
Refactoring Golf is a game designed to stretch your refactoring muscles and get you to explore your IDE to see what's really possible using shortcuts and automation.

This repo contains several source trees, or numbered "Holes".

Your goal is to safely and efficiently as possible refactor the Hole-X code to look like the Hole X+1 code. You must aim to do it in as few "strokes" as possible.

A "stroke" is essentially a change made to the code, and every stroke costs you points.

Your pairing partner should carefully score you as follows:

1 point for every change made to the code using a shortcut or automated IDE feature (e.g., an automated refactoring, code template, or Find/Replace)
2 points for every manual edit. Note that a single "edit" could cover multiple lines of code.
Double points for every change made while the code cannot pass the tests after the previous change.
Zero points for code formatting (e.g., deleting whitespace or optimizing imports).

Allow yourselves a maximum of 2 attempts at each round to determine your best score.

##HINTS: 

1. You may find that customising your IDE is useful (e.g. custom code templates, or even custom refactorings.)

2. If possible, it would be a good idea to have the two versions (Hole X and Hole X+1) of each set of source files open on different machines, as you could easily tie yourself in knots editing the wrong files!

3. Keep that second machine available as a tooling environment. Writing custom tools (scripts, templates etc) costs you zero points in refactoring golf.

##Par scores:
These are the best known scores, achieved using IntelliJ:
- Hole1 - Par 4
- Hole2 - Par 8
- Hole3 - Par 9
- Hole4 - Par 9
- Hole5 - Par 10
- Hole6 - Par 8
 
Total Par: 48
