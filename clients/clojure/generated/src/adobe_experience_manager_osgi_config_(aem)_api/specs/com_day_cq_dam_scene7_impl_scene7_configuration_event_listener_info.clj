(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-info
     :spec com-day-cq-dam-scene7-impl-scene7-configuration-event-listener-info-data}))
