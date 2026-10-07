(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties-spec
   })

(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-info
     :spec com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-info-data}))
