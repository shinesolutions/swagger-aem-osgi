(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-properties-data
  {
   (ds/opt :cqdamimagecachemaxmemory) config-node-property-integer-spec
   (ds/opt :cqdamimagecachemaxage) config-node-property-integer-spec
   (ds/opt :cqdamimagecachemaxdimension) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-properties
     :spec com-day-cq-dam-core-impl-cache-cq-buffered-image-cache-properties-data}))
