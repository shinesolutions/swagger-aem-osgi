(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-async-indexer-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-async-indexer-service-properties-data
  {
   (ds/opt :asyncConfigs) config-node-property-array-spec
   (ds/opt :leaseTimeOutMinutes) config-node-property-integer-spec
   (ds/opt :failingIndexTimeoutSeconds) config-node-property-integer-spec
   (ds/opt :errorWarnIntervalSeconds) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-async-indexer-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-async-indexer-service-properties
     :spec org-apache-jackrabbit-oak-plugins-index-async-indexer-service-properties-data}))
