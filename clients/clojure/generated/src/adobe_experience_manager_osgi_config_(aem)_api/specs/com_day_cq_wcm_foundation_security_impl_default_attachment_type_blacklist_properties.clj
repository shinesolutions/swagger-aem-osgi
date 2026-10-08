(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties-data
  {
   (ds/opt :defaultattachmenttypeblacklist) config-node-property-array-spec
   (ds/opt :baselineattachmenttypeblacklist) config-node-property-array-spec
   })

(def com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties
     :spec com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties-data}))
