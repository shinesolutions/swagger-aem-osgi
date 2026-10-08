(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-account-impl-account-management-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-account-impl-account-management-servlet-properties-data
  {
   (ds/opt :cqaccountmanagerconfiginformnewaccountmail) config-node-property-string-spec
   (ds/opt :cqaccountmanagerconfiginformnewpwdmail) config-node-property-string-spec
   })

(def com-adobe-cq-account-impl-account-management-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-account-impl-account-management-servlet-properties
     :spec com-adobe-cq-account-impl-account-management-servlet-properties-data}))
