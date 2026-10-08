(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-properties-spec
   })

(def org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-info-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-info
     :spec org-apache-sling-scripting-core-impl-scripting-resource-resolver-provider-info-data}))
