(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-tracer-internal-log-tracer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-tracer-internal-log-tracer-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-tracer-internal-log-tracer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-tracer-internal-log-tracer-properties-spec
   })

(def org-apache-sling-tracer-internal-log-tracer-info-spec
  (ds/spec
    {:name ::org-apache-sling-tracer-internal-log-tracer-info
     :spec org-apache-sling-tracer-internal-log-tracer-info-data}))
