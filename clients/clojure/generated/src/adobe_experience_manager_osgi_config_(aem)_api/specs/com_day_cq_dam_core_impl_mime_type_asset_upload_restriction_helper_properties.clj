(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-properties-data
  {
   (ds/opt :cqdamallowallmime) config-node-property-boolean-spec
   (ds/opt :cqdamallowedassetmimes) config-node-property-array-spec
   })

(def com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-properties
     :spec com-day-cq-dam-core-impl-mime-type-asset-upload-restriction-helper-properties-data}))
