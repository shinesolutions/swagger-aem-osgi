(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-vault-packaging-impl-packaging-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-vault-packaging-impl-packaging-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-vault-packaging-impl-packaging-impl-properties-spec
   })

(def org-apache-jackrabbit-vault-packaging-impl-packaging-impl-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-vault-packaging-impl-packaging-impl-info
     :spec org-apache-jackrabbit-vault-packaging-impl-packaging-impl-info-data}))
