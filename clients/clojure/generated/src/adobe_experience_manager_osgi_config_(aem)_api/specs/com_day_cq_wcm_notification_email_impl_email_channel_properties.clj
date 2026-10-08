(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-notification-email-impl-email-channel-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-notification-email-impl-email-channel-properties-data
  {
   (ds/opt :emailfrom) config-node-property-string-spec
   })

(def com-day-cq-wcm-notification-email-impl-email-channel-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-notification-email-impl-email-channel-properties
     :spec com-day-cq-wcm-notification-email-impl-email-channel-properties-data}))
