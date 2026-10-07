(ns adobe-experience-manager-osgi-config-(aem)-api.specs.apache-sling-health-check-result-html-serializer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def apache-sling-health-check-result-html-serializer-properties-data
  {
   (ds/opt :styleString) config-node-property-string-spec
   })

(def apache-sling-health-check-result-html-serializer-properties-spec
  (ds/spec
    {:name ::apache-sling-health-check-result-html-serializer-properties
     :spec apache-sling-health-check-result-html-serializer-properties-data}))
