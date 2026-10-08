(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-account-options-updater-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-account-options-updater-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-account-options-updater-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-testandtarget-impl-account-options-updater-properties-spec
   })

(def com-day-cq-analytics-testandtarget-impl-account-options-updater-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-account-options-updater-info
     :spec com-day-cq-analytics-testandtarget-impl-account-options-updater-info-data}))
