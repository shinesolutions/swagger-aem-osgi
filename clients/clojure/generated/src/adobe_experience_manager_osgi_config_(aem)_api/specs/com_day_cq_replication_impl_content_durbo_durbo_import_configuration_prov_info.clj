(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties-spec
   })

(def com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-info-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-info
     :spec com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-info-data}))
