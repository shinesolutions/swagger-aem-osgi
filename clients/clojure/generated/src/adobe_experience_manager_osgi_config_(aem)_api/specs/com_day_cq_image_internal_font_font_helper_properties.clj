(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-image-internal-font-font-helper-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-image-internal-font-font-helper-properties-data
  {
   (ds/opt :fontpath) config-node-property-array-spec
   (ds/opt :oversamplingFactor) config-node-property-integer-spec
   })

(def com-day-cq-image-internal-font-font-helper-properties-spec
  (ds/spec
    {:name ::com-day-cq-image-internal-font-font-helper-properties
     :spec com-day-cq-image-internal-font-font-helper-properties-data}))
