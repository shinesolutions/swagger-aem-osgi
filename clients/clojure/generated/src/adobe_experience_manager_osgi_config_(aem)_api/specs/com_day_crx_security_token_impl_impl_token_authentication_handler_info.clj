(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-impl-token-authentication-handler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-impl-token-authentication-handler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-crx-security-token-impl-impl-token-authentication-handler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-crx-security-token-impl-impl-token-authentication-handler-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-day-crx-security-token-impl-impl-token-authentication-handler-info-spec
  (ds/spec
    {:name ::com-day-crx-security-token-impl-impl-token-authentication-handler-info
     :spec com-day-crx-security-token-impl-impl-token-authentication-handler-info-data}))
