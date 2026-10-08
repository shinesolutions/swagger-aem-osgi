(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :fallbackPaths) config-node-property-array-spec
   })

(def com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties
     :spec com-adobe-granite-conf-impl-runtime-aware-configuration-resource-resolving-properties-data}))
