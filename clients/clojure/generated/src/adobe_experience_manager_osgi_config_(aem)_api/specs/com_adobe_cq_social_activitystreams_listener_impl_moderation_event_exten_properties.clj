(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-properties-data
  {
   (ds/opt :accepted) config-node-property-boolean-spec
   (ds/opt :ranked) config-node-property-integer-spec
   })

(def com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-properties
     :spec com-adobe-cq-social-activitystreams-listener-impl-moderation-event-exten-properties-data}))
