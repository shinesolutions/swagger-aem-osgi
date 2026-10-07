(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-scriptable-health-check-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-scriptable-health-check-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hc-core-impl-scriptable-health-check-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-hc-core-impl-scriptable-health-check-properties-spec
   })

(def org-apache-sling-hc-core-impl-scriptable-health-check-info-spec
  (ds/spec
    {:name ::org-apache-sling-hc-core-impl-scriptable-health-check-info
     :spec org-apache-sling-hc-core-impl-scriptable-health-check-info-data}))
