(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-compatrouter-impl-routing-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-compatrouter-impl-routing-config-properties-data
  {
   (ds/opt :id) config-node-property-string-spec
   (ds/opt :compatPath) config-node-property-string-spec
   (ds/opt :newPath) config-node-property-string-spec
   })

(def com-adobe-granite-compatrouter-impl-routing-config-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-compatrouter-impl-routing-config-properties
     :spec com-adobe-granite-compatrouter-impl-routing-config-properties-data}))
