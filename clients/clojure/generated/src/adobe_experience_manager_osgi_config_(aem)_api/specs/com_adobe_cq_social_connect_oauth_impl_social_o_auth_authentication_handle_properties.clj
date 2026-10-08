(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-properties-data
  {
   (ds/opt :path) config-node-property-array-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-properties
     :spec com-adobe-cq-social-connect-oauth-impl-social-o-auth-authentication-handle-properties-data}))
