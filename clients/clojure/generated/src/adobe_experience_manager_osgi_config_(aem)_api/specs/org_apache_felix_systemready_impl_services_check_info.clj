(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-impl-services-check-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-impl-services-check-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-impl-services-check-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-systemready-impl-services-check-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-felix-systemready-impl-services-check-info-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-impl-services-check-info
     :spec org-apache-felix-systemready-impl-services-check-info-data}))
