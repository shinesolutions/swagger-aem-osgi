(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-config-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-config-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-log-log-manager-factory-config-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-commons-log-log-manager-factory-config-properties-spec
   })

(def org-apache-sling-commons-log-log-manager-factory-config-info-spec
  (ds/spec
    {:name ::org-apache-sling-commons-log-log-manager-factory-config-info
     :spec org-apache-sling-commons-log-log-manager-factory-config-info-data}))
