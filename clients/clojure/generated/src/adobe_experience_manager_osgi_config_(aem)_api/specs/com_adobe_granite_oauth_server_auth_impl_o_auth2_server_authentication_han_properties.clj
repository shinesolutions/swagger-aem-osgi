(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :jaascontrolFlag) config-node-property-string-spec
   (ds/opt :jaasrealmName) config-node-property-string-spec
   (ds/opt :jaasranking) config-node-property-integer-spec
   (ds/opt :oauthofflinevalidation) config-node-property-boolean-spec
   })

(def com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-properties
     :spec com-adobe-granite-oauth-server-auth-impl-o-auth2-server-authentication-han-properties-data}))
