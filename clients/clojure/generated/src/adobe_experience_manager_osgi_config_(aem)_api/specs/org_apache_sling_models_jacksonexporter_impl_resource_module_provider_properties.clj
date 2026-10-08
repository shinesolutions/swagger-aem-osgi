(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties-data
  {
   (ds/opt :maxrecursionlevels) config-node-property-integer-spec
   })

(def org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties-spec
  (ds/spec
    {:name ::org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties
     :spec org-apache-sling-models-jacksonexporter-impl-resource-module-provider-properties-data}))
