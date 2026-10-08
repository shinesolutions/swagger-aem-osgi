(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-properties-data
  {
   (ds/opt :size) config-node-property-integer-spec
   })

(def com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-properties
     :spec com-adobe-cq-wcm-style-internal-component-style-info-cache-impl-properties-data}))
