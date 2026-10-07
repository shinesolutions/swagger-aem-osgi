(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-ids-impl-ids-pool-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-ids-impl-ids-pool-manager-impl-properties-data
  {
   (ds/opt :maxerrorstoblacklist) config-node-property-integer-spec
   (ds/opt :retryintervaltowhitelist) config-node-property-integer-spec
   (ds/opt :connecttimeout) config-node-property-integer-spec
   (ds/opt :sockettimeout) config-node-property-integer-spec
   (ds/opt :processlabel) config-node-property-string-spec
   (ds/opt :connectionusemax) config-node-property-integer-spec
   })

(def com-day-cq-dam-ids-impl-ids-pool-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-ids-impl-ids-pool-manager-impl-properties
     :spec com-day-cq-dam-ids-impl-ids-pool-manager-impl-properties-data}))
