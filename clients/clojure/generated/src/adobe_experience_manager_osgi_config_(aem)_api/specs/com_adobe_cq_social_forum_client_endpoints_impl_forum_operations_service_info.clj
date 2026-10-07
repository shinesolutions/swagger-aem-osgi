(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-properties-spec
   })

(def com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-info
     :spec com-adobe-cq-social-forum-client-endpoints-impl-forum-operations-service-info-data}))
