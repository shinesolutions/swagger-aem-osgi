(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-account-options-updater-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-account-options-updater-properties-data
  {
   (ds/opt :cqanalyticstestandtargetaccountoptionsupdaterenabled) config-node-property-boolean-spec
   })

(def com-day-cq-analytics-testandtarget-impl-account-options-updater-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-account-options-updater-properties
     :spec com-day-cq-analytics-testandtarget-impl-account-options-updater-properties-data}))
