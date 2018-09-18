# using sed 
# find and replace on first occurrence

sed -i 's/oldtext/newtext/' $1

# find and replace on all occurrences

sed -i 's/oldtext/newtext/g' $1

# sed=stream editor
# -i=inplace (save back to same input file)
# s=substitute command
# g=global -replace all occurences
