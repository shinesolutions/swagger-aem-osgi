(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-properties-data
  {
   (ds/opt :datasources) config-node-property-array-spec
   (ds/opt :step) config-node-property-integer-spec
   (ds/opt :archives) config-node-property-array-spec
   (ds/opt :path) config-node-property-string-spec
   })

(def org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-properties
     :spec org-apache-sling-commons-metrics-rrd4j-impl-codahale-metrics-reporter-properties-data}))
