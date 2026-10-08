(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties-data
  {
   (ds/opt :upgradeTaskIgnoreList) config-node-property-array-spec
   })

(def com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties-spec
  (ds/spec
    {:name ::com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties
     :spec com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties-data}))
