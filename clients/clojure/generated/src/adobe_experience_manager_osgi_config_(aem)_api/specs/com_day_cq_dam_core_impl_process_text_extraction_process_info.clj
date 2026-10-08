(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-process-text-extraction-process-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-process-text-extraction-process-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-process-text-extraction-process-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-core-impl-process-text-extraction-process-properties-spec
   })

(def com-day-cq-dam-core-impl-process-text-extraction-process-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-process-text-extraction-process-info
     :spec com-day-cq-dam-core-impl-process-text-extraction-process-info-data}))
