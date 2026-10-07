(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-properties-spec
   })

(def com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-info
     :spec com-day-cq-dam-stock-integration-impl-cache-stock-cache-configuration-ser-info-data}))
