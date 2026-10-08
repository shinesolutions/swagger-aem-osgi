(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-query-query-engine-settings-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-query-query-engine-settings-service-properties-data
  {
   (ds/opt :queryLimitInMemory) config-node-property-integer-spec
   (ds/opt :queryLimitReads) config-node-property-integer-spec
   (ds/opt :queryFailTraversal) config-node-property-boolean-spec
   (ds/opt :fastQuerySize) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-query-query-engine-settings-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-query-query-engine-settings-service-properties
     :spec org-apache-jackrabbit-oak-query-query-engine-settings-service-properties-data}))
