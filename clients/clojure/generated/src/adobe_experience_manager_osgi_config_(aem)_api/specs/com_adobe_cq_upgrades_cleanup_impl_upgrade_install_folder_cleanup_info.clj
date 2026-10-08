(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-properties-spec
   })

(def com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-info-spec
  (ds/spec
    {:name ::com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-info
     :spec com-adobe-cq-upgrades-cleanup-impl-upgrade-install-folder-cleanup-info-data}))
