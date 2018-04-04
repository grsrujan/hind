import sys

file = open(sys.argv[1]+".xml","w")
file.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<schema dbmsId=\"hive_id\">\n")
filepath = sys.argv[1]
with open(filepath) as fp:
   line = fp.readline()
   cnt = 1
   while line:
       file.write("    <column comment=\"\" default=\"\" key=\"false\" label=\"{}\"\n\t\tlength=\"-1\" nullable=\"true\"\n\t\toriginalDbColumnName=\"{}\" pattern=\"\"\n\t\tprecision=\"-1\" talendType=\"id_String\" type=\"STRING\"/>\n".format(line.strip(),line.strip()))
       line = fp.readline()
       cnt += 1
file.write("</schema>")
