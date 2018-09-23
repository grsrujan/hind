### wrapper script 
- gen_sqoop.sh - This scripts helps in invoking child script with parallelism

### child script
- sqoop_child.sh

### config files
- common.cfg -  contains rdbms, log,trigger, mail details
- table_list.cfg - contains table level settings

### template 
- import_template.sh - this will have multiple sqoop commands for importing data, we can choose required command by passing values from table_list.cfg file
