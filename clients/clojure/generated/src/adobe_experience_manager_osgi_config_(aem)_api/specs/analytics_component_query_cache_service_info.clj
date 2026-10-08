(ns adobe-experience-manager-osgi-config-(aem)-api.specs.analytics-component-query-cache-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.analytics-component-query-cache-service-properties :refer :all]
            )
  (:import (java.io File)))


(def analytics-component-query-cache-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) analytics-component-query-cache-service-properties-spec
   })

(def analytics-component-query-cache-service-info-spec
  (ds/spec
    {:name ::analytics-component-query-cache-service-info
     :spec analytics-component-query-cache-service-info-data}))
