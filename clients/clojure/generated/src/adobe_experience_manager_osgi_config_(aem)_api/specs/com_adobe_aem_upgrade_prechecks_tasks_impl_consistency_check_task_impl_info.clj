(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties-spec
   })

(def com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-info-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-info
     :spec com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-info-data}))
