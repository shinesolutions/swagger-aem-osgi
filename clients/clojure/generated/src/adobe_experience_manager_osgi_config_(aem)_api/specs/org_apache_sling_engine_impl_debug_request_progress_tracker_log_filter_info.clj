(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-properties-spec
   })

(def org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-info-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-info
     :spec org-apache-sling-engine-impl-debug-request-progress-tracker-log-filter-info-data}))
