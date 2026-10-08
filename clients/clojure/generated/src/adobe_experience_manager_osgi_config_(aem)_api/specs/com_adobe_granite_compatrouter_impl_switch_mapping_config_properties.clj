(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-compatrouter-impl-switch-mapping-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-compatrouter-impl-switch-mapping-config-properties-data
  {
   (ds/opt :group) config-node-property-string-spec
   (ds/opt :ids) config-node-property-array-spec
   })

(def com-adobe-granite-compatrouter-impl-switch-mapping-config-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-compatrouter-impl-switch-mapping-config-properties
     :spec com-adobe-granite-compatrouter-impl-switch-mapping-config-properties-data}))
