(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-properties-spec
   })

(def com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-info
     :spec com-day-cq-dam-pim-impl-sourcing-upload-process-product-assets-upload-pro-info-data}))
