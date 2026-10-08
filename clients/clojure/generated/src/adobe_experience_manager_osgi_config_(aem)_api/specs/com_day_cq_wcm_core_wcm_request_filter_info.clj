(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-wcm-request-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-wcm-request-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-wcm-request-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-core-wcm-request-filter-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-wcm-core-wcm-request-filter-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-wcm-request-filter-info
     :spec com-day-cq-wcm-core-wcm-request-filter-info-data}))
