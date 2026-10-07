(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-models-jacksonexporter-impl-resource-module-provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-models-jacksonexporter-impl-resource-module-provider-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties-spec
   })

(def org-apache-sling-models-jacksonexporter-impl-resource-module-provider-info-spec
  (ds/spec
    {:name ::org-apache-sling-models-jacksonexporter-impl-resource-module-provider-info
     :spec org-apache-sling-models-jacksonexporter-impl-resource-module-provider-info-data}))
