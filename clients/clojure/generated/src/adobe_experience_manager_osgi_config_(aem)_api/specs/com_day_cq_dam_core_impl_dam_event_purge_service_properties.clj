(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-dam-event-purge-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-dam-event-purge-service-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :maxSavedActivities) config-node-property-integer-spec
   (ds/opt :saveInterval) config-node-property-integer-spec
   (ds/opt :enableActivityPurge) config-node-property-boolean-spec
   (ds/opt :eventTypes) config-node-property-drop-down-spec
   })

(def com-day-cq-dam-core-impl-dam-event-purge-service-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-dam-event-purge-service-properties
     :spec com-day-cq-dam-core-impl-dam-event-purge-service-properties-data}))
