(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-page-page-manager-factory-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-page-page-manager-factory-impl-properties-data
  {
   (ds/opt :illegalCharMapping) config-node-property-string-spec
   (ds/opt :pageSubTreeActivationCheck) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-core-impl-page-page-manager-factory-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-page-page-manager-factory-impl-properties
     :spec com-day-cq-wcm-core-impl-page-page-manager-factory-impl-properties-data}))
