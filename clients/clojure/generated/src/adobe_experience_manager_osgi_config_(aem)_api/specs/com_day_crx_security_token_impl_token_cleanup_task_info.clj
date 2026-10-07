(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-token-cleanup-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-token-cleanup-task-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-crx-security-token-impl-token-cleanup-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-crx-security-token-impl-token-cleanup-task-properties-spec
   })

(def com-day-crx-security-token-impl-token-cleanup-task-info-spec
  (ds/spec
    {:name ::com-day-crx-security-token-impl-token-cleanup-task-info
     :spec com-day-crx-security-token-impl-token-cleanup-task-info-data}))
