(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-properties-data
  {
   (ds/opt :eventtopics) config-node-property-string-spec
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :verbs) config-node-property-array-spec
   })

(def com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-properties
     :spec com-adobe-cq-social-commons-ugclimiter-impl-ugc-limiter-service-impl-properties-data}))
