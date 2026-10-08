(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-dam-event-recorder-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-dam-event-recorder-impl-properties-data
  {
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :eventqueuelength) config-node-property-integer-spec
   (ds/opt :eventrecorderenabled) config-node-property-boolean-spec
   (ds/opt :eventrecorderblacklist) config-node-property-array-spec
   (ds/opt :eventrecordereventtypes) config-node-property-drop-down-spec
   })

(def com-day-cq-dam-core-impl-dam-event-recorder-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-dam-event-recorder-impl-properties
     :spec com-day-cq-dam-core-impl-dam-event-recorder-impl-properties-data}))
