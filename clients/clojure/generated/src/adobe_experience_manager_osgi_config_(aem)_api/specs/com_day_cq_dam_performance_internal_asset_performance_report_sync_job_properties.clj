(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-performance-internal-asset-performance-report-sync-job-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-performance-internal-asset-performance-report-sync-job-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   })

(def com-day-cq-dam-performance-internal-asset-performance-report-sync-job-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-performance-internal-asset-performance-report-sync-job-properties
     :spec com-day-cq-dam-performance-internal-asset-performance-report-sync-job-properties-data}))
