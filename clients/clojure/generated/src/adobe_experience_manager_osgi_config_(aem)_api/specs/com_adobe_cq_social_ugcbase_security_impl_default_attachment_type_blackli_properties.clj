(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties-data
  {
   (ds/opt :defaultattachmenttypeblacklist) config-node-property-array-spec
   (ds/opt :baselineattachmenttypeblacklist) config-node-property-array-spec
   })

(def com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties
     :spec com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties-data}))
