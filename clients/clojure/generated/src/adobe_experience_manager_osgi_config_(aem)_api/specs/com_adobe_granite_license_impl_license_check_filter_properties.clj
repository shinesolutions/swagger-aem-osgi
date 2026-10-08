(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-license-impl-license-check-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-license-impl-license-check-filter-properties-data
  {
   (ds/opt :checkInternval) config-node-property-integer-spec
   (ds/opt :excludeIds) config-node-property-array-spec
   (ds/opt :encryptPing) config-node-property-boolean-spec
   })

(def com-adobe-granite-license-impl-license-check-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-license-impl-license-check-filter-properties
     :spec com-adobe-granite-license-impl-license-check-filter-properties-data}))
