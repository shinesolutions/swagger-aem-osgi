(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties
     :spec com-adobe-granite-auth-oauth-impl-o-auth-authentication-handler-properties-data}))
