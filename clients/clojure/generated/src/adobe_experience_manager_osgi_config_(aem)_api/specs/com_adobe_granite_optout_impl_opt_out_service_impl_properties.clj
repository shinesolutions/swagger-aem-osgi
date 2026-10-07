(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-optout-impl-opt-out-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-optout-impl-opt-out-service-impl-properties-data
  {
   (ds/opt :optoutcookies) config-node-property-array-spec
   (ds/opt :optoutheaders) config-node-property-array-spec
   (ds/opt :optoutwhitelistcookies) config-node-property-array-spec
   })

(def com-adobe-granite-optout-impl-opt-out-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-optout-impl-opt-out-service-impl-properties
     :spec com-adobe-granite-optout-impl-opt-out-service-impl-properties-data}))
