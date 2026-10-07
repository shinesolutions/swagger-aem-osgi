(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties-spec
   })

(def com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-info-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-info
     :spec com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-info-data}))
