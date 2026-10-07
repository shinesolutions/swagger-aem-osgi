(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-sync-impl-diff-changes-observer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-sync-impl-diff-changes-observer-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :agentName) config-node-property-string-spec
   (ds/opt :diffPath) config-node-property-string-spec
   (ds/opt :propertyNames) config-node-property-string-spec
   })

(def com-adobe-cq-social-sync-impl-diff-changes-observer-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-sync-impl-diff-changes-observer-properties
     :spec com-adobe-cq-social-sync-impl-diff-changes-observer-properties-data}))
