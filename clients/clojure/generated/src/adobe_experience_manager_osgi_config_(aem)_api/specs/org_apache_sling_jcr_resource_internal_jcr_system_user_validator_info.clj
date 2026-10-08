(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-system-user-validator-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-resource-internal-jcr-system-user-validator-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties-spec
   })

(def org-apache-sling-jcr-resource-internal-jcr-system-user-validator-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-resource-internal-jcr-system-user-validator-info
     :spec org-apache-sling-jcr-resource-internal-jcr-system-user-validator-info-data}))
