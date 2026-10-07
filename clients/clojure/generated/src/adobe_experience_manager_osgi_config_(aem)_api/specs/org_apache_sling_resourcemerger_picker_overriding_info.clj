(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resourcemerger-picker-overriding-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resourcemerger-picker-overriding-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-resourcemerger-picker-overriding-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-resourcemerger-picker-overriding-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-resourcemerger-picker-overriding-info-spec
  (ds/spec
    {:name ::org-apache-sling-resourcemerger-picker-overriding-info
     :spec org-apache-sling-resourcemerger-picker-overriding-info-data}))
