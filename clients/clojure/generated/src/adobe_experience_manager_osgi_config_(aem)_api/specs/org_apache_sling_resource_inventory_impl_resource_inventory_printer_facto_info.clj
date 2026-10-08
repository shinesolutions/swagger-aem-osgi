(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties-spec
   })

(def org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-info-spec
  (ds/spec
    {:name ::org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-info
     :spec org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-info-data}))
