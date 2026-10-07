(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :minimumcodecachesize) config-node-property-integer-spec
   })

(def com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties
     :spec com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties-data}))
