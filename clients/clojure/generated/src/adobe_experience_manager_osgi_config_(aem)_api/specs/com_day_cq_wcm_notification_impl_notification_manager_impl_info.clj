(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-notification-impl-notification-manager-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-notification-impl-notification-manager-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-notification-impl-notification-manager-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-notification-impl-notification-manager-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-wcm-notification-impl-notification-manager-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-notification-impl-notification-manager-impl-info
     :spec com-day-cq-wcm-notification-impl-notification-manager-impl-info-data}))
