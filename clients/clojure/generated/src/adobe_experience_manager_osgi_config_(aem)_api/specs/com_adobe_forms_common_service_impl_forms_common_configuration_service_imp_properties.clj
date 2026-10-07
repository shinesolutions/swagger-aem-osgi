(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties-data
  {
   (ds/opt :tempStorageConfig) config-node-property-drop-down-spec
   })

(def com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties-spec
  (ds/spec
    {:name ::com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties
     :spec com-adobe-forms-common-service-impl-forms-common-configuration-service-imp-properties-data}))
