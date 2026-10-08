(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-threads-impl-default-thread-pool-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-threads-impl-default-thread-pool-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties-spec
   })

(def org-apache-sling-commons-threads-impl-default-thread-pool-factory-info-spec
  (ds/spec
    {:name ::org-apache-sling-commons-threads-impl-default-thread-pool-factory-info
     :spec org-apache-sling-commons-threads-impl-default-thread-pool-factory-info-data}))
