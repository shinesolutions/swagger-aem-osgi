(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-hc-content-packages-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-hc-content-packages-health-check-properties-data
  {
   (ds/opt :hcname) config-node-property-string-spec
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :hcmbeanname) config-node-property-string-spec
   (ds/opt :packagenames) config-node-property-array-spec
   })

(def com-adobe-cq-hc-content-packages-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-hc-content-packages-health-check-properties
     :spec com-adobe-cq-hc-content-packages-health-check-properties-data}))
