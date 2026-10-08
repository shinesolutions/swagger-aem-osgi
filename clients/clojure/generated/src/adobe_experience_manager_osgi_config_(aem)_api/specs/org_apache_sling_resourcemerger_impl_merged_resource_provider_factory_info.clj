(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-properties-spec
   })

(def org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-info-spec
  (ds/spec
    {:name ::org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-info
     :spec org-apache-sling-resourcemerger-impl-merged-resource-provider-factory-info-data}))
