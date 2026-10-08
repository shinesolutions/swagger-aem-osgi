(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :configPath) config-node-property-string-spec
   (ds/opt :fallbackPaths) config-node-property-array-spec
   (ds/opt :configCollectionInheritancePropertyNames) config-node-property-array-spec
   })

(def org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-properties
     :spec org-apache-sling-caconfig-resource-impl-def-default-configuration-resour-properties-data}))
