(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-asset-move-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-asset-move-listener-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-asset-move-listener-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-asset-move-listener-properties
     :spec com-day-cq-dam-core-impl-asset-move-listener-properties-data}))
