(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-site-endpoints-impl-site-operation-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-site-endpoints-impl-site-operation-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties-spec
   })

(def com-adobe-cq-social-site-endpoints-impl-site-operation-service-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-site-endpoints-impl-site-operation-service-info
     :spec com-adobe-cq-social-site-endpoints-impl-site-operation-service-info-data}))
