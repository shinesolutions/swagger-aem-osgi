(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-properties-data
  {
   (ds/opt :deletepathregexps) config-node-property-array-spec
   (ds/opt :deletesql2query) config-node-property-string-spec
   })

(def com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-properties
     :spec com-adobe-cq-upgrades-cleanup-impl-upgrade-content-cleanup-properties-data}))
