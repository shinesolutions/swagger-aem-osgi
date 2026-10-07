(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties-data
  {
   (ds/opt :cqdams7damdynamicmediaconfigeventlistenerenabled) config-node-property-boolean-spec
   })

(def com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties
     :spec com-day-cq-dam-s7dam-common-analytics-impl-s7dam-dynamic-media-config-even-properties-data}))
