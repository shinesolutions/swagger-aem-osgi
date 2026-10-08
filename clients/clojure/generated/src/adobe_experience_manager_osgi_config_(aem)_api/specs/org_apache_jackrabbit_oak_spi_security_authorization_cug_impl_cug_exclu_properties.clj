(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-properties-data
  {
   (ds/opt :principalNames) config-node-property-array-spec
   })

(def org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-properties
     :spec org-apache-jackrabbit-oak-spi-security-authorization-cug-impl-cug-exclu-properties-data}))
