(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-properties-data
  {
   (ds/opt :cqdams7damdamchangeeventlistenerenabled) config-node-property-boolean-spec
   })

(def com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-properties
     :spec com-day-cq-dam-s7dam-common-s7dam-dam-change-event-listener-properties-data}))
