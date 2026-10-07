(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties-spec
   })

(def org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-info-spec
  (ds/spec
    {:name ::org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-info
     :spec org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-info-data}))
