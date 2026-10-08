(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-warp-time-warp-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-warp-time-warp-filter-properties-data
  {
   (ds/opt :filterorder) config-node-property-string-spec
   (ds/opt :filterscope) config-node-property-string-spec
   })

(def com-day-cq-wcm-core-impl-warp-time-warp-filter-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-warp-time-warp-filter-properties
     :spec com-day-cq-wcm-core-impl-warp-time-warp-filter-properties-data}))
