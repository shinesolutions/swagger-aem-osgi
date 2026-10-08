(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties-data
  {
   (ds/opt :isMemberCheck) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties
     :spec com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties-data}))
