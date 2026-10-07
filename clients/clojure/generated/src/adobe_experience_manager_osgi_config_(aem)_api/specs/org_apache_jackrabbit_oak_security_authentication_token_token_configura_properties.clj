(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-authentication-token-token-configura-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-authentication-token-token-configura-properties-data
  {
   (ds/opt :tokenExpiration) config-node-property-string-spec
   (ds/opt :tokenLength) config-node-property-string-spec
   (ds/opt :tokenRefresh) config-node-property-boolean-spec
   (ds/opt :tokenCleanupThreshold) config-node-property-integer-spec
   (ds/opt :passwordHashAlgorithm) config-node-property-string-spec
   (ds/opt :passwordHashIterations) config-node-property-integer-spec
   (ds/opt :passwordSaltSize) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-security-authentication-token-token-configura-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-authentication-token-token-configura-properties
     :spec org-apache-jackrabbit-oak-security-authentication-token-token-configura-properties-data}))
