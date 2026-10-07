(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-impl-mcm-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mcm-impl-mcm-configuration-properties-data
  {
   (ds/opt :experienceindirection) config-node-property-array-spec
   (ds/opt :touchpointindirection) config-node-property-array-spec
   })

(def com-day-cq-mcm-impl-mcm-configuration-properties-spec
  (ds/spec
    {:name ::com-day-cq-mcm-impl-mcm-configuration-properties
     :spec com-day-cq-mcm-impl-mcm-configuration-properties-data}))
