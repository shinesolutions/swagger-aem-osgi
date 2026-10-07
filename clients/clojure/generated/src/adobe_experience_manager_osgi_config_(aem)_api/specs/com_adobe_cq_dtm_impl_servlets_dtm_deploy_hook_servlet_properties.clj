(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties-data
  {
   (ds/opt :dtmstagingipwhitelist) config-node-property-array-spec
   (ds/opt :dtmproductionipwhitelist) config-node-property-array-spec
   })

(def com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties
     :spec com-adobe-cq-dtm-impl-servlets-dtm-deploy-hook-servlet-properties-data}))
