(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties-data
  {
   (ds/opt :orgapacheslingscriptingsightlyjsbindings) config-node-property-array-spec
   })

(def org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties
     :spec org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties-data}))
