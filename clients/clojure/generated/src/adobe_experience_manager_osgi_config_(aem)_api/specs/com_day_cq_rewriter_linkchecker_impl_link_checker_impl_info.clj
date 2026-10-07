(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-checker-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-rewriter-linkchecker-impl-link-checker-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-checker-impl-info
     :spec com-day-cq-rewriter-linkchecker-impl-link-checker-impl-info-data}))
