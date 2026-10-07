(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :agentName) config-node-property-string-spec
   (ds/opt :diffPath) config-node-property-string-spec
   (ds/opt :observedPath) config-node-property-string-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :propertyNames) config-node-property-string-spec
   (ds/opt :distributionDelay) config-node-property-integer-spec
   (ds/opt :serviceUsertarget) config-node-property-string-spec
   })

(def com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-properties
     :spec com-adobe-granite-distribution-core-impl-diff-diff-changes-observer-properties-data}))
