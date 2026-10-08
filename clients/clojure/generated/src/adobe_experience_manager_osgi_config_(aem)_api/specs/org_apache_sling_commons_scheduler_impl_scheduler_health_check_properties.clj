(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-scheduler-impl-scheduler-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-scheduler-impl-scheduler-health-check-properties-data
  {
   (ds/opt :maxquartzJobdurationacceptable) config-node-property-integer-spec
   })

(def org-apache-sling-commons-scheduler-impl-scheduler-health-check-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-scheduler-impl-scheduler-health-check-properties
     :spec org-apache-sling-commons-scheduler-impl-scheduler-health-check-properties-data}))
