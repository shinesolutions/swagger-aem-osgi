(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-agent-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-agent-manager-impl-properties-data
  {
   (ds/opt :jobtopics) config-node-property-string-spec
   (ds/opt :serviceUsertarget) config-node-property-string-spec
   (ds/opt :agentProvidertarget) config-node-property-string-spec
   })

(def com-day-cq-replication-impl-agent-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-agent-manager-impl-properties
     :spec com-day-cq-replication-impl-agent-manager-impl-properties-data}))
