(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties-data
  {
   (ds/opt :streamPath) config-node-property-string-spec
   (ds/opt :streamName) config-node-property-string-spec
   })

(def com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties
     :spec com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties-data}))
