(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-service-user-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-service-user-configuration-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :serviceuserssimpleSubjectPopulation) config-node-property-boolean-spec
   (ds/opt :serviceuserslist) config-node-property-array-spec
   })

(def com-adobe-granite-repository-service-user-configuration-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-service-user-configuration-properties
     :spec com-adobe-granite-repository-service-user-configuration-properties-data}))
