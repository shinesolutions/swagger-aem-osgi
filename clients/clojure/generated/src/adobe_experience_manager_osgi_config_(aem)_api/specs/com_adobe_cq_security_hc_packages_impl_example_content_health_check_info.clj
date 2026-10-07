(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-packages-impl-example-content-health-check-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-security-hc-packages-impl-example-content-health-check-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-security-hc-packages-impl-example-content-health-check-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-cq-security-hc-packages-impl-example-content-health-check-info-spec
  (ds/spec
    {:name ::com-adobe-cq-security-hc-packages-impl-example-content-health-check-info
     :spec com-adobe-cq-security-hc-packages-impl-example-content-health-check-info-data}))
