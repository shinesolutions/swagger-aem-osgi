(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties-spec
   })

(def org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-info-spec
  (ds/spec
    {:name ::org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-info
     :spec org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-info-data}))
