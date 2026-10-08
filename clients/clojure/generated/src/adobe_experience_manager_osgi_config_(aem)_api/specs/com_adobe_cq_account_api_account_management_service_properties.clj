(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-account-api-account-management-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-account-api-account-management-service-properties-data
  {
   (ds/opt :cqaccountmanagertokenvalidityperiod) config-node-property-integer-spec
   (ds/opt :cqaccountmanagerconfigrequestnewaccountmail) config-node-property-string-spec
   (ds/opt :cqaccountmanagerconfigrequestnewpwdmail) config-node-property-string-spec
   })

(def com-adobe-cq-account-api-account-management-service-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-account-api-account-management-service-properties
     :spec com-adobe-cq-account-api-account-management-service-properties-data}))
