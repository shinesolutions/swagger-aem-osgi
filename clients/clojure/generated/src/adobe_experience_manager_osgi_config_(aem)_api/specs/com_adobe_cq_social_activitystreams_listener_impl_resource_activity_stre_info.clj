(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-info
     :spec com-adobe-cq-social-activitystreams-listener-impl-resource-activity-stre-info-data}))
