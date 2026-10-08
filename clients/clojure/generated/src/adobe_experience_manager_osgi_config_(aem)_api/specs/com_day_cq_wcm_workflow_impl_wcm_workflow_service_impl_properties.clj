(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-properties-data
  {
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :minThreadPoolSize) config-node-property-integer-spec
   (ds/opt :maxThreadPoolSize) config-node-property-integer-spec
   (ds/opt :cqwcmworkflowterminateonactivate) config-node-property-boolean-spec
   (ds/opt :cqwcmworklfowterminateexclusionlist) config-node-property-array-spec
   })

(def com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-properties
     :spec com-day-cq-wcm-workflow-impl-wcm-workflow-service-impl-properties-data}))
