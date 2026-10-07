(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-info-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-info
     :spec org-apache-sling-scripting-sightly-js-impl-jsapi-sly-bindings-values-prov-info-data}))
