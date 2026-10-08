(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-references-content-content-reference-config-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-references-content-content-reference-config-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-references-content-content-reference-config-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-core-impl-references-content-content-reference-config-properties-spec
   })

(def com-day-cq-wcm-core-impl-references-content-content-reference-config-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-references-content-content-reference-config-info
     :spec com-day-cq-wcm-core-impl-references-content-content-reference-config-info-data}))
