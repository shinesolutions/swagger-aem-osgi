(ns adobe-experience-manager-osgi-config-(aem)-api.specs.apache-sling-health-check-result-html-serializer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.apache-sling-health-check-result-html-serializer-properties :refer :all]
            )
  (:import (java.io File)))


(def apache-sling-health-check-result-html-serializer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) apache-sling-health-check-result-html-serializer-properties-spec
   })

(def apache-sling-health-check-result-html-serializer-info-spec
  (ds/spec
    {:name ::apache-sling-health-check-result-html-serializer-info
     :spec apache-sling-health-check-result-html-serializer-info-data}))
