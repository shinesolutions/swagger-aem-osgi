(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties-data
  {
   (ds/opt :dmreplicateonmodifyenabled) config-node-property-boolean-spec
   (ds/opt :dmreplicateonmodifyforcesyncdeletes) config-node-property-boolean-spec
   })

(def com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties
     :spec com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties-data}))
