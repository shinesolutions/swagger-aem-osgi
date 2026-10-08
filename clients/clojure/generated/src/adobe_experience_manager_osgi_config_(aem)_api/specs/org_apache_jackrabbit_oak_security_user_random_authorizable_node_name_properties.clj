(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties-data
  {
   (ds/opt :length) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties
     :spec org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties-data}))
