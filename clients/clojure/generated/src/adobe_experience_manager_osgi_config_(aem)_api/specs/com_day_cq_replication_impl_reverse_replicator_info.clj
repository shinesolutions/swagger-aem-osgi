(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-reverse-replicator-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-reverse-replicator-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-reverse-replicator-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-replication-impl-reverse-replicator-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-cq-replication-impl-reverse-replicator-info-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-reverse-replicator-info
     :spec com-day-cq-replication-impl-reverse-replicator-info-data}))
