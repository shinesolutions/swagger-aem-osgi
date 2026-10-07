(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties-data
  {
   (ds/opt :watchwordspositive) config-node-property-array-spec
   (ds/opt :watchwordsnegative) config-node-property-array-spec
   (ds/opt :watchwordspath) config-node-property-string-spec
   (ds/opt :sentimentpath) config-node-property-string-spec
   })

(def com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties
     :spec com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties-data}))
