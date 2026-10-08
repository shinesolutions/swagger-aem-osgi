(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-properties-spec
   })

(def com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-info-spec
  (ds/spec
    {:name ::com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-info
     :spec com-adobe-granite-replication-hc-impl-replication-transport-users-health-c-info-data}))
