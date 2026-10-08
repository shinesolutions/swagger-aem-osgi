(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties-data
  {
   (ds/opt :deletenameregexps) config-node-property-array-spec
   })

(def com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties
     :spec com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties-data}))
