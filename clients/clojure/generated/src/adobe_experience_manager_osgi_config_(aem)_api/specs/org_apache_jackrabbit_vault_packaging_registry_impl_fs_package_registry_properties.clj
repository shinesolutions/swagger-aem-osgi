(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-properties-data
  {
   (ds/opt :homePath) config-node-property-string-spec
   })

(def org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-properties
     :spec org-apache-jackrabbit-vault-packaging-registry-impl-fs-package-registry-properties-data}))
