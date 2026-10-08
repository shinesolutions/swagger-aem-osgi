(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-properties-data
  {
   (ds/opt :fullgcdays) config-node-property-array-spec
   })

(def com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-properties
     :spec com-adobe-granite-maintenance-crx-impl-revision-cleanup-task-properties-data}))
