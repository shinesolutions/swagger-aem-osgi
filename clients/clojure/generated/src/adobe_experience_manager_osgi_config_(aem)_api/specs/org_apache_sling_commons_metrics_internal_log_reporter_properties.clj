(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-metrics-internal-log-reporter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-metrics-internal-log-reporter-properties-data
  {
   (ds/opt :period) config-node-property-integer-spec
   (ds/opt :timeUnit) config-node-property-drop-down-spec
   (ds/opt :level) config-node-property-drop-down-spec
   (ds/opt :loggerName) config-node-property-string-spec
   (ds/opt :prefix) config-node-property-string-spec
   (ds/opt :pattern) config-node-property-string-spec
   (ds/opt :registryName) config-node-property-string-spec
   })

(def org-apache-sling-commons-metrics-internal-log-reporter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-metrics-internal-log-reporter-properties
     :spec org-apache-sling-commons-metrics-internal-log-reporter-properties-data}))
