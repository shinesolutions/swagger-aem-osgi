(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties-data
  {
   (ds/opt :cqsocialcontentfragmentsservicesenabled) config-node-property-boolean-spec
   (ds/opt :cqsocialcontentfragmentsserviceswaitTimeSeconds) config-node-property-integer-spec
   })

(def com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties
     :spec com-adobe-cq-social-content-fragments-services-impl-communities-fragmen-properties-data}))
