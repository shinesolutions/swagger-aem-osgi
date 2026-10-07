(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-properties-spec
   })

(def com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-info
     :spec com-adobe-cq-social-ugcbase-security-impl-default-attachment-type-blackli-info-data}))
