(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-properties-spec
   })

(def com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-info
     :spec com-day-cq-analytics-testandtarget-impl-delete-author-activity-listener-info-data}))
