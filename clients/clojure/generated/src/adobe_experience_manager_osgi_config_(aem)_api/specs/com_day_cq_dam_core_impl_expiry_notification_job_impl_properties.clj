(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-expiry-notification-job-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-expiry-notification-job-impl-properties-data
  {
   (ds/opt :cqdamexpirynotificationscheduleristimebased) config-node-property-boolean-spec
   (ds/opt :cqdamexpirynotificationschedulertimebasedrule) config-node-property-string-spec
   (ds/opt :cqdamexpirynotificationschedulerperiodrule) config-node-property-integer-spec
   (ds/opt :send_email) config-node-property-boolean-spec
   (ds/opt :asset_expired_limit) config-node-property-integer-spec
   (ds/opt :prior_notification_seconds) config-node-property-integer-spec
   (ds/opt :cqdamexpirynotificationurlprotocol) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-expiry-notification-job-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-expiry-notification-job-impl-properties
     :spec com-day-cq-dam-core-impl-expiry-notification-job-impl-properties-data}))
