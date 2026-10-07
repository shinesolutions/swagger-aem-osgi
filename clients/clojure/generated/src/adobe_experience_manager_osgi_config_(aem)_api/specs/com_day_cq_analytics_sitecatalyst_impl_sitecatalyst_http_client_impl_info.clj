(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-info
     :spec com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-info-data}))
