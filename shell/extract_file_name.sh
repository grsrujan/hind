
file=$1
extension="${file##*.}"
filename="${file%.*}"

echo "$file"
echo "$extension"
echo "$filename"

filename="${file##*/}"
