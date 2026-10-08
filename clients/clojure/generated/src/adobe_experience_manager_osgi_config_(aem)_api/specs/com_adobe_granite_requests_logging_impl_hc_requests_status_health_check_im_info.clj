(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-properties-spec
   })

(def com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-info-spec
  (ds/spec
    {:name ::com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-info
     :spec com-adobe-granite-requests-logging-impl-hc-requests-status-health-check-im-info-data}))
