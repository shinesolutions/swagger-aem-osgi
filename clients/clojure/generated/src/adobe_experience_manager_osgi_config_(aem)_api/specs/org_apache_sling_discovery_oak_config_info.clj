(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-discovery-oak-config-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-discovery-oak-config-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-discovery-oak-config-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-discovery-oak-config-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-discovery-oak-config-info-spec
  (ds/spec
    {:name ::org-apache-sling-discovery-oak-config-info
     :spec org-apache-sling-discovery-oak-config-info-data}))
