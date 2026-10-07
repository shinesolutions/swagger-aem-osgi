(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-missing-metadata-notification-job-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-missing-metadata-notification-job-properties-data
  {
   (ds/opt :cqdammissingmetadatanotificationscheduleristimebased) config-node-property-boolean-spec
   (ds/opt :cqdammissingmetadatanotificationschedulertimebasedrule) config-node-property-string-spec
   (ds/opt :cqdammissingmetadatanotificationschedulerperiodrule) config-node-property-integer-spec
   (ds/opt :cqdammissingmetadatanotificationrecipient) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-missing-metadata-notification-job-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-missing-metadata-notification-job-properties
     :spec com-day-cq-dam-core-impl-missing-metadata-notification-job-properties-data}))
