(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-management-impl-configuration-management-setti-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-management-impl-configuration-management-setti-properties-data
  {
   (ds/opt :ignorePropertyNameRegex) config-node-property-array-spec
   (ds/opt :configCollectionPropertiesResourceNames) config-node-property-array-spec
   })

(def org-apache-sling-caconfig-management-impl-configuration-management-setti-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-management-impl-configuration-management-setti-properties
     :spec org-apache-sling-caconfig-management-impl-configuration-management-setti-properties-data}))
