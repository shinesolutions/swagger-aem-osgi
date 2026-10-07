(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-process-text-extraction-process-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-process-text-extraction-process-properties-data
  {
   (ds/opt :mimeTypes) config-node-property-array-spec
   (ds/opt :maxExtract) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-process-text-extraction-process-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-process-text-extraction-process-properties
     :spec com-day-cq-dam-core-impl-process-text-extraction-process-properties-data}))
