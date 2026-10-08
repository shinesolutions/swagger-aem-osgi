(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hapi-impl-h-api-util-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hapi-impl-h-api-util-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hapi-impl-h-api-util-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-hapi-impl-h-api-util-impl-properties-spec
   })

(def org-apache-sling-hapi-impl-h-api-util-impl-info-spec
  (ds/spec
    {:name ::org-apache-sling-hapi-impl-h-api-util-impl-info
     :spec org-apache-sling-hapi-impl-h-api-util-impl-info-data}))
