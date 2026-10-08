(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-expiry-notification-job-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-expiry-notification-job-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-expiry-notification-job-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-core-impl-expiry-notification-job-impl-properties-spec
   })

(def com-day-cq-dam-core-impl-expiry-notification-job-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-expiry-notification-job-impl-info
     :spec com-day-cq-dam-core-impl-expiry-notification-job-impl-info-data}))
