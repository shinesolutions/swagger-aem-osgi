(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :locale) config-node-property-string-spec
   (ds/opt :imsConfig) config-node-property-string-spec
   })

(def com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-properties
     :spec com-day-cq-dam-stock-integration-impl-configuration-stock-configuration-properties-data}))
