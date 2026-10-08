(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-optout-impl-opt-out-service-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-optout-impl-opt-out-service-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-optout-impl-opt-out-service-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-optout-impl-opt-out-service-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-granite-optout-impl-opt-out-service-impl-info-spec
  (ds/spec
    {:name ::com-adobe-granite-optout-impl-opt-out-service-impl-info
     :spec com-adobe-granite-optout-impl-opt-out-service-impl-info-data}))
