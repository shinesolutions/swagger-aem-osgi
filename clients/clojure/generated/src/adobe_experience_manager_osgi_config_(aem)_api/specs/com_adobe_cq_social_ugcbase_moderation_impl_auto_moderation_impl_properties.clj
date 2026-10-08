(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-properties-data
  {
   (ds/opt :automoderationsequence) config-node-property-array-spec
   (ds/opt :automoderationonfailurestop) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-properties
     :spec com-adobe-cq-social-ugcbase-moderation-impl-auto-moderation-impl-properties-data}))
