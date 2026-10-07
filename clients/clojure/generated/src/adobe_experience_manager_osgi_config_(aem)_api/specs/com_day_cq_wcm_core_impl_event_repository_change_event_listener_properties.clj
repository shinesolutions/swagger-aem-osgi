(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-event-repository-change-event-listener-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-event-repository-change-event-listener-properties-data
  {
   (ds/opt :paths) config-node-property-array-spec
   (ds/opt :excludedPaths) config-node-property-array-spec
   })

(def com-day-cq-wcm-core-impl-event-repository-change-event-listener-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-event-repository-change-event-listener-properties
     :spec com-day-cq-wcm-core-impl-event-repository-change-event-listener-properties-data}))
