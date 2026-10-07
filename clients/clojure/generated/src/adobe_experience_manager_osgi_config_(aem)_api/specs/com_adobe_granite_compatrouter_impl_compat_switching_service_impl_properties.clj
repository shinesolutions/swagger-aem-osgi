(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-compatrouter-impl-compat-switching-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-compatrouter-impl-compat-switching-service-impl-properties-data
  {
   (ds/opt :compatgroups) config-node-property-array-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-compatrouter-impl-compat-switching-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-compatrouter-impl-compat-switching-service-impl-properties
     :spec com-adobe-granite-compatrouter-impl-compat-switching-service-impl-properties-data}))
