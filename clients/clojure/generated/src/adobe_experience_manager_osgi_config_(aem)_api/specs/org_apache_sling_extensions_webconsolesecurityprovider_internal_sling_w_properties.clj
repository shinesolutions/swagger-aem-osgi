(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties-data
  {
   (ds/opt :users) config-node-property-array-spec
   (ds/opt :groups) config-node-property-array-spec
   })

(def org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties-spec
  (ds/spec
    {:name ::org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties
     :spec org-apache-sling-extensions-webconsolesecurityprovider-internal-sling-w-properties-data}))
