(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties-data
  {
   (ds/opt :packageRoots) config-node-property-array-spec
   })

(def org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties
     :spec org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties-data}))
