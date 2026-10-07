(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-properties-data
  {
   (ds/opt :threadPoolSize) config-node-property-integer-spec
   (ds/opt :delayTime) config-node-property-integer-spec
   (ds/opt :workerSleepTime) config-node-property-integer-spec
   })

(def com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-properties
     :spec com-adobe-cq-social-ugcbase-dispatcher-impl-flush-service-impl-properties-data}))
