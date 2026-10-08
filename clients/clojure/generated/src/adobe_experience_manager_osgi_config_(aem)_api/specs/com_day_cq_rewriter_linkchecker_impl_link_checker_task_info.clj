(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-checker-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties-spec
   })

(def com-day-cq-rewriter-linkchecker-impl-link-checker-task-info-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-checker-task-info
     :spec com-day-cq-rewriter-linkchecker-impl-link-checker-task-info-data}))
