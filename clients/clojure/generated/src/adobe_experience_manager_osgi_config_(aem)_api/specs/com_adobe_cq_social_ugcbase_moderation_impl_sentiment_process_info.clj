(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-properties-spec
   })

(def com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-info
     :spec com-adobe-cq-social-ugcbase-moderation-impl-sentiment-process-info-data}))
