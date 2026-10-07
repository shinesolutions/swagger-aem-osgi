(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-activitystreams-impl-activity-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-activitystreams-impl-activity-manager-impl-properties-data
  {
   (ds/opt :aggregaterelationships) config-node-property-array-spec
   (ds/opt :aggregatedescendvirtual) config-node-property-boolean-spec
   })

(def com-adobe-granite-activitystreams-impl-activity-manager-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-activitystreams-impl-activity-manager-impl-properties
     :spec com-adobe-granite-activitystreams-impl-activity-manager-impl-properties-data}))
