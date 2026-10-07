(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-accountverification-impl-account-management-config-im-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-accountverification-impl-account-management-config-im-properties-data
  {
   (ds/opt :enable) config-node-property-boolean-spec
   (ds/opt :ttl1) config-node-property-integer-spec
   (ds/opt :ttl2) config-node-property-integer-spec
   })

(def com-adobe-cq-social-accountverification-impl-account-management-config-im-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-accountverification-impl-account-management-config-im-properties
     :spec com-adobe-cq-social-accountverification-impl-account-management-config-im-properties-data}))
