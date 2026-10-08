(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-properties-data
  {
   (ds/opt :cqdamscene7damchangeeventlistenerenabled) config-node-property-boolean-spec
   (ds/opt :cqdamscene7damchangeeventlistenerobservedpaths) config-node-property-array-spec
   })

(def com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-properties
     :spec com-day-cq-dam-scene7-impl-scene7-dam-change-event-listener-properties-data}))
