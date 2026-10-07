(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dtm-reactor-impl-service-web-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dtm-reactor-impl-service-web-service-impl-properties-data
  {
   (ds/opt :endpointUri) config-node-property-string-spec
   (ds/opt :connectionTimeout) config-node-property-integer-spec
   (ds/opt :socketTimeout) config-node-property-integer-spec
   })

(def com-adobe-cq-dtm-reactor-impl-service-web-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dtm-reactor-impl-service-web-service-impl-properties
     :spec com-adobe-cq-dtm-reactor-impl-service-web-service-impl-properties-data}))
