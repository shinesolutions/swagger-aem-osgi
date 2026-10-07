(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-authentication-authentication-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-authentication-authentication-config-properties-data
  {
   (ds/opt :orgapachejackrabbitoakauthenticationappName) config-node-property-string-spec
   (ds/opt :orgapachejackrabbitoakauthenticationconfigSpiName) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-security-authentication-authentication-config-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-authentication-authentication-config-properties
     :spec org-apache-jackrabbit-oak-security-authentication-authentication-config-properties-data}))
