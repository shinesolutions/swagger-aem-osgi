(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-contentsync-impl-content-sync-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-contentsync-impl-content-sync-manager-impl-properties-data
  {
   (ds/opt :contentsyncfallbackauthorizable) config-node-property-string-spec
   (ds/opt :contentsyncfallbackupdateuser) config-node-property-string-spec
   })

(def com-day-cq-contentsync-impl-content-sync-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-contentsync-impl-content-sync-manager-impl-properties
     :spec com-day-cq-contentsync-impl-content-sync-manager-impl-properties-data}))
