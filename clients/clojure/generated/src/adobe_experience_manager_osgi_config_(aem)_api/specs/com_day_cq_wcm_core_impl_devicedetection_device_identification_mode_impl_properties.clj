(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-properties-data
  {
   (ds/opt :dimdefaultmode) config-node-property-drop-down-spec
   (ds/opt :dimappcacheenabled) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-properties
     :spec com-day-cq-wcm-core-impl-devicedetection-device-identification-mode-impl-properties-data}))
