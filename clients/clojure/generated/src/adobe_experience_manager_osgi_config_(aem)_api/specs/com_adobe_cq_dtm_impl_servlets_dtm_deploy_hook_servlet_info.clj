(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties-spec
   })

(def com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-info
     :spec com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-info-data}))
