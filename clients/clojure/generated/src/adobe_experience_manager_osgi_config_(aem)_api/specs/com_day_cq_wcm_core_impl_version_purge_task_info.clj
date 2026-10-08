(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-version-purge-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-version-purge-task-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-version-purge-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-core-impl-version-purge-task-properties-spec
   })

(def com-day-cq-wcm-core-impl-version-purge-task-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-version-purge-task-info
     :spec com-day-cq-wcm-core-impl-version-purge-task-info-data}))
