(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-properties-data
  {
   (ds/opt :deviceinfotransformerenabled) config-node-property-boolean-spec
   (ds/opt :deviceinfotransformercssstyle) config-node-property-string-spec
   })

(def com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-properties
     :spec com-day-cq-wcm-mobile-core-impl-device-device-info-transformer-factory-properties-data}))
