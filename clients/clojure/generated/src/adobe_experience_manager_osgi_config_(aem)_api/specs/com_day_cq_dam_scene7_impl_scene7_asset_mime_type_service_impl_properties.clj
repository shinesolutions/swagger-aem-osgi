(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-properties-data
  {
   (ds/opt :cqdamscene7assetmimetypeservicemapping) config-node-property-array-spec
   })

(def com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-properties
     :spec com-day-cq-dam-scene7-impl-scene7-asset-mime-type-service-impl-properties-data}))
