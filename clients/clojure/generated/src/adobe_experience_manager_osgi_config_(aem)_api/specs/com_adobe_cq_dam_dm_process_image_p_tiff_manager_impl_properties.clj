(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-properties-data
  {
   (ds/opt :maxMemory) config-node-property-integer-spec
   })

(def com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-properties
     :spec com-adobe-cq-dam-dm-process-image-p-tiff-manager-impl-properties-data}))
