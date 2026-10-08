(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-diff-diff-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-diff-diff-event-listener-properties-data
  {
   (ds/opt :diffPath) config-node-property-string-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :serviceUsertarget) config-node-property-string-spec
   })

(def com-adobe-granite-distribution-core-impl-diff-diff-event-listener-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-diff-diff-event-listener-properties
     :spec com-adobe-granite-distribution-core-impl-diff-diff-event-listener-properties-data}))
