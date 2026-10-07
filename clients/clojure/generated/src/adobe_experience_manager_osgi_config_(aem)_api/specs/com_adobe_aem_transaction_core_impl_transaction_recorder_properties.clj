(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-transaction-core-impl-transaction-recorder-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-transaction-core-impl-transaction-recorder-properties-data
  {
   (ds/opt :isTransactionRecordingEnabled) config-node-property-boolean-spec
   })

(def com-adobe-aem-transaction-core-impl-transaction-recorder-properties-spec
  (ds/spec
    {:name ::com-adobe-aem-transaction-core-impl-transaction-recorder-properties
     :spec com-adobe-aem-transaction-core-impl-transaction-recorder-properties-data}))
