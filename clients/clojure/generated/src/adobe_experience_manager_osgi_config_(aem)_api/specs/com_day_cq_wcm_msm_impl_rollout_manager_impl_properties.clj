(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-msm-impl-rollout-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-msm-impl-rollout-manager-impl-properties-data
  {
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :rolloutmgrexcludedpropsdefault) config-node-property-array-spec
   (ds/opt :rolloutmgrexcludedparagraphpropsdefault) config-node-property-array-spec
   (ds/opt :rolloutmgrexcludednodetypesdefault) config-node-property-array-spec
   (ds/opt :rolloutmgrthreadpoolmaxsize) config-node-property-integer-spec
   (ds/opt :rolloutmgrthreadpoolmaxshutdowntime) config-node-property-integer-spec
   (ds/opt :rolloutmgrthreadpoolpriority) config-node-property-drop-down-spec
   (ds/opt :rolloutmgrcommitsize) config-node-property-integer-spec
   (ds/opt :rolloutmgrconflicthandlingenabled) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-msm-impl-rollout-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-msm-impl-rollout-manager-impl-properties
     :spec com-day-cq-wcm-msm-impl-rollout-manager-impl-properties-data}))
