(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-access-token-cleanup-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-access-token-cleanup-task-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-oauth-server-impl-access-token-cleanup-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-oauth-server-impl-access-token-cleanup-task-properties-spec
   })

(def com-adobe-granite-oauth-server-impl-access-token-cleanup-task-info-spec
  (ds/spec
    {:name ::com-adobe-granite-oauth-server-impl-access-token-cleanup-task-info
     :spec com-adobe-granite-oauth-server-impl-access-token-cleanup-task-info-data}))
