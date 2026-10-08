(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :dispatcheraddress) config-node-property-string-spec
   (ds/opt :dispatcherfilterallowed) config-node-property-array-spec
   (ds/opt :dispatcherfilterblocked) config-node-property-array-spec
   })

(def com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-properties
     :spec com-adobe-cq-security-hc-dispatcher-impl-dispatcher-access-health-check-properties-data}))
