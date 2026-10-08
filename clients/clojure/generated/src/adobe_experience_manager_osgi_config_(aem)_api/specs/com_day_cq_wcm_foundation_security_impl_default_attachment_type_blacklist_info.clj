(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-properties-spec
   })

(def com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-info
     :spec com-day-cq-wcm-foundation-security-impl-default-attachment-type-blacklist-info-data}))
