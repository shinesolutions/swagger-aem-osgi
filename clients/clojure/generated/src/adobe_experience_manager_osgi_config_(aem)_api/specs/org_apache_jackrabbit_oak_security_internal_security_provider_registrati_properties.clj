(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-internal-security-provider-registrati-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-internal-security-provider-registrati-properties-data
  {
   (ds/opt :requiredServicePids) config-node-property-array-spec
   (ds/opt :authorizationCompositionType) config-node-property-drop-down-spec
   })

(def org-apache-jackrabbit-oak-security-internal-security-provider-registrati-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-internal-security-provider-registrati-properties
     :spec org-apache-jackrabbit-oak-security-internal-security-provider-registrati-properties-data}))
