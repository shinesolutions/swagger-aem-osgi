(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties-data
  {
   (ds/opt :deletezipfile) config-node-property-boolean-spec
   })

(def com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties
     :spec com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties-data}))
