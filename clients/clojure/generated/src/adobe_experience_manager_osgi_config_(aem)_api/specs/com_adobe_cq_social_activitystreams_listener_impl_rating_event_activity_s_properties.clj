(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-properties-data
  {
   (ds/opt :ranking) config-node-property-integer-spec
   (ds/opt :enable) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-properties
     :spec com-adobe-cq-social-activitystreams-listener-impl-rating-event-activity-s-properties-data}))
