(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-service-impl-default-data-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-service-impl-default-data-provider-properties-data
  {
   (ds/opt :alloweddataFileLocations) config-node-property-array-spec
   })

(def com-adobe-forms-common-service-impl-default-data-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-forms-common-service-impl-default-data-provider-properties
     :spec com-adobe-forms-common-service-impl-default-data-provider-properties-data}))
