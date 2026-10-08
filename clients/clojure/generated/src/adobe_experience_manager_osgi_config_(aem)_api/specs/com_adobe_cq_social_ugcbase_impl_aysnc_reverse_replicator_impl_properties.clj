(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-properties-data
  {
   (ds/opt :poolSize) config-node-property-integer-spec
   (ds/opt :maxPoolSize) config-node-property-integer-spec
   (ds/opt :queueSize) config-node-property-integer-spec
   (ds/opt :keepAliveTime) config-node-property-integer-spec
   })

(def com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-properties
     :spec com-adobe-cq-social-ugcbase-impl-aysnc-reverse-replicator-impl-properties-data}))
