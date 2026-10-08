(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-api-client-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-scene7-impl-scene7-api-client-impl-properties-data
  {
   (ds/opt :cqdamscene7apiclientrecordsperpagenofiltername) config-node-property-integer-spec
   (ds/opt :cqdamscene7apiclientrecordsperpagewithfiltername) config-node-property-integer-spec
   })

(def com-day-cq-dam-scene7-impl-scene7-api-client-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-scene7-impl-scene7-api-client-impl-properties
     :spec com-day-cq-dam-scene7-impl-scene7-api-client-impl-properties-data}))
