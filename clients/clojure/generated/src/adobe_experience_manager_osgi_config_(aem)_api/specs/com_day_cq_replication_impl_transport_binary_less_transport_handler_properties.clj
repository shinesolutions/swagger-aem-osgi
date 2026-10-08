(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-transport-binary-less-transport-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-transport-binary-less-transport-handler-properties-data
  {
   (ds/opt :disabledciphersuites) config-node-property-array-spec
   (ds/opt :enabledciphersuites) config-node-property-array-spec
   })

(def com-day-cq-replication-impl-transport-binary-less-transport-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-transport-binary-less-transport-handler-properties
     :spec com-day-cq-replication-impl-transport-binary-less-transport-handler-properties-data}))
