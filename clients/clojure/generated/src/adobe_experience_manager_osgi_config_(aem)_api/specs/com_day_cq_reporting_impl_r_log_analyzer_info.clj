(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-reporting-impl-r-log-analyzer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-reporting-impl-r-log-analyzer-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-reporting-impl-r-log-analyzer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-reporting-impl-r-log-analyzer-properties-spec
   })

(def com-day-cq-reporting-impl-r-log-analyzer-info-spec
  (ds/spec
    {:name ::com-day-cq-reporting-impl-r-log-analyzer-info
     :spec com-day-cq-reporting-impl-r-log-analyzer-info-data}))
