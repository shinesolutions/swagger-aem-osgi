(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-properties-spec
   })

(def com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-info
     :spec com-adobe-granite-oauth-server-impl-o-auth2-token-revocation-servlet-info-data}))
