(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-startupfilter-impl-startup-filter-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-startupfilter-impl-startup-filter-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-startupfilter-impl-startup-filter-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-startupfilter-impl-startup-filter-impl-properties-spec
   })

(def org-apache-sling-startupfilter-impl-startup-filter-impl-info-spec
  (ds/spec
    {:name ::org-apache-sling-startupfilter-impl-startup-filter-impl-info
     :spec org-apache-sling-startupfilter-impl-startup-filter-impl-info-data}))
