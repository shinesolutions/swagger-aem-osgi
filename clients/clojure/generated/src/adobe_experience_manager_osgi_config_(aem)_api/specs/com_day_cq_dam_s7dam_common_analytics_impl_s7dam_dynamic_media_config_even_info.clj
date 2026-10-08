(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties-spec
   })

(def com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-info
     :spec com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-info-data}))
