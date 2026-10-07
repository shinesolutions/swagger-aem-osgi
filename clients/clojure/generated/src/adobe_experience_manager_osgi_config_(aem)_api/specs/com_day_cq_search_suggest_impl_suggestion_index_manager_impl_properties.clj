(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-search-suggest-impl-suggestion-index-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-search-suggest-impl-suggestion-index-manager-impl-properties-data
  {
   (ds/opt :pathBuildertarget) config-node-property-string-spec
   (ds/opt :suggestbasepath) config-node-property-string-spec
   })

(def com-day-cq-search-suggest-impl-suggestion-index-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-search-suggest-impl-suggestion-index-manager-impl-properties
     :spec com-day-cq-search-suggest-impl-suggestion-index-manager-impl-properties-data}))
