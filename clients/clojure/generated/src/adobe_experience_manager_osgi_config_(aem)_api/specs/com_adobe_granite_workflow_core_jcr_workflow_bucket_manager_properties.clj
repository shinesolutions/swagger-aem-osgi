(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties-data
  {
   (ds/opt :bucketSize) config-node-property-integer-spec
   })

(def com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties
     :spec com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties-data}))
