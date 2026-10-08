(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-properties-data
  {
   (ds/opt :Feedgeneratoralgorithm) config-node-property-drop-down-spec
   })

(def com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-properties
     :spec com-adobe-cq-commerce-pim-impl-productfeed-product-feed-service-impl-properties-data}))
