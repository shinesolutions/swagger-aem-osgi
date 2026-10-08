(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties-spec
   })

(def com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-info
     :spec com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-info-data}))
