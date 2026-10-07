(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-audit-purge-replication-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-audit-purge-replication-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-audit-purge-replication-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-audit-purge-replication-properties-spec
   })

(def com-adobe-cq-audit-purge-replication-info-spec
  (ds/spec
    {:name ::com-adobe-cq-audit-purge-replication-info
     :spec com-adobe-cq-audit-purge-replication-info-data}))
