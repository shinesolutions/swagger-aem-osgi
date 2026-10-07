(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-resources-impl-distribution-service-resour-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-resources-impl-distribution-service-resour-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-resources-impl-distribution-service-resour-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-distribution-resources-impl-distribution-service-resour-properties-spec
   })

(def org-apache-sling-distribution-resources-impl-distribution-service-resour-info-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-resources-impl-distribution-service-resour-info
     :spec org-apache-sling-distribution-resources-impl-distribution-service-resour-info-data}))
