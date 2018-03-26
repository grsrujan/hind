if [[ `ps -ef | grep -I $0 | grep -v grep |wc -l` -ge 1 ]];then
    echo "more than one process is runnig for $0"
fi

echo "number of process running for $0: `ps -ef | grep -I $0 | grep -v grep |wc -l`"
