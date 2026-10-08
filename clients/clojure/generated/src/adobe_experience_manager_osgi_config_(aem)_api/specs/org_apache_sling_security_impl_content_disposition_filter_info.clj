(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-security-impl-content-disposition-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-security-impl-content-disposition-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-security-impl-content-disposition-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-security-impl-content-disposition-filter-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-security-impl-content-disposition-filter-info-spec
  (ds/spec
    {:name ::org-apache-sling-security-impl-content-disposition-filter-info
     :spec org-apache-sling-security-impl-content-disposition-filter-info-data}))
