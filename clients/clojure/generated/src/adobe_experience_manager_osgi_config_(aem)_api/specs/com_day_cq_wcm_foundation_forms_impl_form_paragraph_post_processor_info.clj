(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-properties-spec
   })

(def com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-info
     :spec com-day-cq-wcm-foundation-forms-impl-form-paragraph-post-processor-info-data}))
