(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties-spec
   })

(def org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-info-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-info
     :spec org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-info-data}))
