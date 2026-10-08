(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-replication-receiver-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-replication-receiver-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-replication-receiver-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-replication-impl-replication-receiver-impl-properties-spec
   })

(def com-day-cq-replication-impl-replication-receiver-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-replication-receiver-impl-info
     :spec com-day-cq-replication-impl-replication-receiver-impl-info-data}))
