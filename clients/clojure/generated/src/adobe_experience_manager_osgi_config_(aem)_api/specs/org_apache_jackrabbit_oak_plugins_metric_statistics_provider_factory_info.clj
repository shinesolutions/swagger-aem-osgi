(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties-spec
   })

(def org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-info
     :spec org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-info-data}))
