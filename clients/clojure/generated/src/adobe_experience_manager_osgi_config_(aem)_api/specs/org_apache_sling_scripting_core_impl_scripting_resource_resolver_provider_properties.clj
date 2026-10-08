(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties-data
  {
   (ds/opt :logstacktraceonclose) config-node-property-boolean-spec
   })

(def org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties
     :spec org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties-data}))
