(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-writer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-writer-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-log-log-manager-factory-writer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-commons-log-log-manager-factory-writer-properties-spec
   })

(def org-apache-sling-commons-log-log-manager-factory-writer-info-spec
  (ds/spec
    {:name ::org-apache-sling-commons-log-log-manager-factory-writer-info
     :spec org-apache-sling-commons-log-log-manager-factory-writer-info-data}))
