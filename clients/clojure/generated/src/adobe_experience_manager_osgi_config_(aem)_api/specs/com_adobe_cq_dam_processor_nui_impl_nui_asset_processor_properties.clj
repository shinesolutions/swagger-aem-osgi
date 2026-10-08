(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-properties-data
  {
   (ds/opt :nuiEnabled) config-node-property-boolean-spec
   (ds/opt :nuiServiceUrl) config-node-property-string-spec
   (ds/opt :nuiApiKey) config-node-property-string-spec
   })

(def com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-properties
     :spec com-adobe-cq-dam-processor-nui-impl-nui-asset-processor-properties-data}))
