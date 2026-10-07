(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :excludesearchpath) config-node-property-array-spec
   })

(def com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-properties
     :spec com-adobe-granite-repository-hc-impl-content-sling-sling-content-health-c-properties-data}))
