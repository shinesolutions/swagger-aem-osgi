(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties-data
  {
   (ds/opt :rootpath) config-node-property-string-spec
   (ds/opt :fixinconsistencies) config-node-property-boolean-spec
   })

(def com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties
     :spec com-adobe-aem-upgrade-prechecks-tasks-impl-consistency-check-task-impl-properties-data}))
