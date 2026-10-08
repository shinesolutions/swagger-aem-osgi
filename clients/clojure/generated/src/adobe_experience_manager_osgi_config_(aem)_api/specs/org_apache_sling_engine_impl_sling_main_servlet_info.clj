(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-sling-main-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-sling-main-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-sling-main-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-engine-impl-sling-main-servlet-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-engine-impl-sling-main-servlet-info-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-sling-main-servlet-info
     :spec org-apache-sling-engine-impl-sling-main-servlet-info-data}))
