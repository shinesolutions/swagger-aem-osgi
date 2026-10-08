(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-core-impl-script-cache-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-core-impl-script-cache-impl-properties-data
  {
   (ds/opt :orgapacheslingscriptingcachesize) config-node-property-integer-spec
   (ds/opt :orgapacheslingscriptingcacheadditional_extensions) config-node-property-array-spec
   })

(def org-apache-sling-scripting-core-impl-script-cache-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-core-impl-script-cache-impl-properties
     :spec org-apache-sling-scripting-core-impl-script-cache-impl-properties-data}))
