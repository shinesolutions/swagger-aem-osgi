(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-comments-internal-comment-replication-content-filter-fac-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-comments-internal-comment-replication-content-filter-fac-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties-spec
   })

(def com-adobe-granite-comments-internal-comment-replication-content-filter-fac-info-spec
  (ds/spec
    {:name ::com-adobe-granite-comments-internal-comment-replication-content-filter-fac-info
     :spec com-adobe-granite-comments-internal-comment-replication-content-filter-fac-info-data}))
