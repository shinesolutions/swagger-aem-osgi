(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-properties-data
  {
   (ds/opt :threshold) config-node-property-integer-spec
   (ds/opt :jobTopicName) config-node-property-string-spec
   (ds/opt :emailEnabled) config-node-property-boolean-spec
   })

(def com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-properties
     :spec com-adobe-cq-wcm-jobs-async-impl-async-move-config-provider-service-properties-data}))
