(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-account-impl-account-management-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-account-impl-account-management-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-account-impl-account-management-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-account-impl-account-management-servlet-properties-spec
   })

(def com-adobe-cq-account-impl-account-management-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-cq-account-impl-account-management-servlet-info
     :spec com-adobe-cq-account-impl-account-management-servlet-info-data}))
