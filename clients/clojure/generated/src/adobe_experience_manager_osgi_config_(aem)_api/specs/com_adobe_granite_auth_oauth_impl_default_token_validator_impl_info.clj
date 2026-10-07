(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-default-token-validator-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-default-token-validator-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties-spec
   })

(def com-adobe-granite-auth-oauth-impl-default-token-validator-impl-info-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-default-token-validator-impl-info
     :spec com-adobe-granite-auth-oauth-impl-default-token-validator-impl-info-data}))
