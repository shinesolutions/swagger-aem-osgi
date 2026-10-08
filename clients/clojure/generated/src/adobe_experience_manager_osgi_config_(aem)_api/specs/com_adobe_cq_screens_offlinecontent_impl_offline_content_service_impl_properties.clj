(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-properties-data
  {
   (ds/opt :disableSmartSync) config-node-property-boolean-spec
   })

(def com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-properties
     :spec com-adobe-cq-screens-offlinecontent-impl-offline-content-service-impl-properties-data}))
