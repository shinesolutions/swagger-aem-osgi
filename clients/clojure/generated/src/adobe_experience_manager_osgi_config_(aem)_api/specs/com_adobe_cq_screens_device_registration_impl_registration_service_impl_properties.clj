(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-device-registration-impl-registration-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-device-registration-impl-registration-service-impl-properties-data
  {
   (ds/opt :deviceRegistrationTimeout) config-node-property-integer-spec
   })

(def com-adobe-cq-screens-device-registration-impl-registration-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-device-registration-impl-registration-service-impl-properties
     :spec com-adobe-cq-screens-device-registration-impl-registration-service-impl-properties-data}))
