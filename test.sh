
echo "-----------------------------------------------------"
echo  "--------  Compiling...  --------"
echo  "--------  Compiling...  --------"
echo  "--------  Compiling...  --------"
echo  "--------  Compiling...  --------"


# cp test.sh test_copy.txt
# echo "$(<test_copy.txt )"

echo "$(<test.sh)"
echo '# text hereeeeee' >> test.sh
echo '# text hereeeeee' >> test.sh
echo "$(<test.sh)"
