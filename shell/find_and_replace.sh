# using sed 
# find and replace on first occurrence

sed -i 's/oldtext/newtext/' file_name

# find and replace on all occurrences

sed -i 's/oldtext/newtext/g' file_name

# sed=stream editor
# -i=inplace (save back to same input file)
# s=substitute command
# g=global -replace all occurences
