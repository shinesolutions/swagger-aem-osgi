(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-info
     :spec org-apache-sling-jcr-resource-internal-jcr-resource-resolver-factory-impl-info-data}))
