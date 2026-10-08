(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-properties-data
  {
   (ds/opt :pipelinetype) config-node-property-string-spec
   })

(def com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-properties
     :spec com-adobe-cq-dam-cfm-impl-content-rewriter-asset-processor-properties-data}))
