(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-scheduler-impl-quartz-scheduler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-scheduler-impl-quartz-scheduler-properties-data
  {
   (ds/opt :poolName) config-node-property-string-spec
   (ds/opt :allowedPoolNames) config-node-property-array-spec
   (ds/opt :scheduleruseleaderforsingle) config-node-property-boolean-spec
   (ds/opt :metricsfilters) config-node-property-array-spec
   (ds/opt :slowThresholdMillis) config-node-property-integer-spec
   })

(def org-apache-sling-commons-scheduler-impl-quartz-scheduler-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-scheduler-impl-quartz-scheduler-properties
     :spec org-apache-sling-commons-scheduler-impl-quartz-scheduler-properties-data}))
