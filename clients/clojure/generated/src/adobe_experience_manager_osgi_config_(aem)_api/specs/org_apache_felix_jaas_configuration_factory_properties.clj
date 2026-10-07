(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-jaas-configuration-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-jaas-configuration-factory-properties-data
  {
   (ds/opt :jaascontrolFlag) config-node-property-drop-down-spec
   (ds/opt :jaasranking) config-node-property-integer-spec
   (ds/opt :jaasrealmName) config-node-property-string-spec
   (ds/opt :jaasclassname) config-node-property-string-spec
   (ds/opt :jaasoptions) config-node-property-array-spec
   })

(def org-apache-felix-jaas-configuration-factory-properties-spec
  (ds/spec
    {:name ::org-apache-felix-jaas-configuration-factory-properties
     :spec org-apache-felix-jaas-configuration-factory-properties-data}))
