(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-properties-spec
   })

(def com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-info-spec
  (ds/spec
    {:name ::com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-info
     :spec com-day-cq-compat-codeupgrade-impl-upgrade-task-ignore-list-info-data}))
