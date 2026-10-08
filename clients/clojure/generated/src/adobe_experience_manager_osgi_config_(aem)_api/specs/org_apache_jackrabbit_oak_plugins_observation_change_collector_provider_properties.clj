(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-properties-data
  {
   (ds/opt :maxItems) config-node-property-integer-spec
   (ds/opt :maxPathDepth) config-node-property-integer-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-properties
     :spec org-apache-jackrabbit-oak-plugins-observation-change-collector-provider-properties-data}))
