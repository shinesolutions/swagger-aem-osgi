(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-properties-data
  {
   (ds/opt :cqdambatchmetadataassetdefault) config-node-property-array-spec
   (ds/opt :cqdambatchmetadatacollectiondefault) config-node-property-array-spec
   (ds/opt :cqdambatchmetadatamaxresources) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-batch-metadata-servlet-properties-data}))
