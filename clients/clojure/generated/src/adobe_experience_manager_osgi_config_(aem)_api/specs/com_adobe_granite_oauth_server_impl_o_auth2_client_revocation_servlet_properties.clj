(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-properties-data
  {
   (ds/opt :oauthclientrevocationactive) config-node-property-boolean-spec
   })

(def com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-properties
     :spec com-adobe-granite-oauth-server-impl-o-auth2-client-revocation-servlet-properties-data}))
