(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-properties-spec
   })

(def com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-info-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-info
     :spec com-adobe-cq-dam-ips-impl-replication-trigger-replicate-on-modify-worker-info-data}))
