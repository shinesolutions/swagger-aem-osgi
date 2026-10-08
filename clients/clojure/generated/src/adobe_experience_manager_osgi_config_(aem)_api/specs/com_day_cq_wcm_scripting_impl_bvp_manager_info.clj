(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-scripting-impl-bvp-manager-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-scripting-impl-bvp-manager-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-scripting-impl-bvp-manager-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-scripting-impl-bvp-manager-properties-spec
   })

(def com-day-cq-wcm-scripting-impl-bvp-manager-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-scripting-impl-bvp-manager-info
     :spec com-day-cq-wcm-scripting-impl-bvp-manager-info-data}))
