(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-properties-data
  {
   (ds/opt :parameterwhitelist) config-node-property-array-spec
   (ds/opt :parameterwhitelistprefixes) config-node-property-array-spec
   (ds/opt :binaryparameterwhitelist) config-node-property-array-spec
   (ds/opt :modifierwhitelist) config-node-property-array-spec
   (ds/opt :operationwhitelist) config-node-property-array-spec
   (ds/opt :operationwhitelistprefixes) config-node-property-array-spec
   (ds/opt :typehintwhitelist) config-node-property-array-spec
   (ds/opt :resourcetypewhitelist) config-node-property-array-spec
   })

(def com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-properties
     :spec com-day-cq-wcm-foundation-security-impl-safer-sling-post-validator-impl-properties-data}))
