(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-properties-data
  {
   (ds/opt :cugSupportedPaths) config-node-property-array-spec
   (ds/opt :cugEnabled) config-node-property-boolean-spec
   (ds/opt :configurationRanking) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-properties
     :spec org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-confi-properties-data}))
