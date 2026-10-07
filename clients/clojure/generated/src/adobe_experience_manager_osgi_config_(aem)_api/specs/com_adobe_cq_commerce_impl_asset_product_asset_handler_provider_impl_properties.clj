(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-properties-data
  {
   (ds/opt :cqcommerceassethandlerfallback) config-node-property-string-spec
   })

(def com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-properties
     :spec com-adobe-cq-commerce-impl-asset-product-asset-handler-provider-impl-properties-data}))
