(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties-data
  {
   (ds/opt :enable) config-node-property-boolean-spec
   (ds/opt :UGCLimit) config-node-property-integer-spec
   (ds/opt :ugcLimitDuration) config-node-property-integer-spec
   (ds/opt :domains) config-node-property-array-spec
   (ds/opt :toList) config-node-property-array-spec
   })

(def com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties
     :spec com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties-data}))
