(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-language-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-language-manager-impl-properties-data
  {
   (ds/opt :langmgrlistpath) config-node-property-string-spec
   (ds/opt :langmgrcountrydefault) config-node-property-array-spec
   })

(def com-day-cq-wcm-core-impl-language-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-language-manager-impl-properties
     :spec com-day-cq-wcm-core-impl-language-manager-impl-properties-data}))
