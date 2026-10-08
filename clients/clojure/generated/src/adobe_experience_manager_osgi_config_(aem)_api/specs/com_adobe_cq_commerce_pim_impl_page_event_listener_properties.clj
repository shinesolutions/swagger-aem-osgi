(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-commerce-pim-impl-page-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-commerce-pim-impl-page-event-listener-properties-data
  {
   (ds/opt :cqcommercepageeventlistenerenabled) config-node-property-boolean-spec
   })

(def com-adobe-cq-commerce-pim-impl-page-event-listener-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-commerce-pim-impl-page-event-listener-properties
     :spec com-adobe-cq-commerce-pim-impl-page-event-listener-properties-data}))
