(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-ids-impl-ids-job-processor-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-ids-impl-ids-job-processor-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-ids-impl-ids-job-processor-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-ids-impl-ids-job-processor-properties-spec
   })

(def com-day-cq-dam-ids-impl-ids-job-processor-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-ids-impl-ids-job-processor-info
     :spec com-day-cq-dam-ids-impl-ids-job-processor-info-data}))
