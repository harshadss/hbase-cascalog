(ns hbase.cascalog.ops
  (:use cascalog.api)
  (:import [cascading.hbase.helper HBaseMapToTuples HBaseTuplesToMap]))

(defn as-string
  "Used for de-serializing bytes coming out of HBase to String"
  [bytes]
  (if (nil? bytes)
     ""
     (String. bytes)
  )
)
