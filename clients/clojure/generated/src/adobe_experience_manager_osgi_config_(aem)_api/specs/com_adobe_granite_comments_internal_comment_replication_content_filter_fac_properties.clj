(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties-data
  {
   (ds/opt :replicatecommentresourceTypes) config-node-property-array-spec
   })

(def com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties
     :spec com-adobe-granite-comments-internal-comment-replication-content-filter-fac-properties-data}))
