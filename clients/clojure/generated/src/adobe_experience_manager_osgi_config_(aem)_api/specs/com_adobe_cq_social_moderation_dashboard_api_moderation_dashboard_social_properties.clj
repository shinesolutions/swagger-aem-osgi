(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-properties-data
  {
   (ds/opt :priority) config-node-property-integer-spec
   })

(def com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-properties
     :spec com-adobe-cq-social-moderation-dashboard-api-moderation-dashboard-social-properties-data}))
