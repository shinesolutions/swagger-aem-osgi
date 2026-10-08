(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :oauthclientIdsallowed) config-node-property-array-spec
   (ds/opt :authbearersyncims) config-node-property-boolean-spec
   (ds/opt :authtokenRequestParameter) config-node-property-string-spec
   (ds/opt :oauthbearerconfigid) config-node-property-string-spec
   (ds/opt :oauthjwtsupport) config-node-property-boolean-spec
   })

(def com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-properties
     :spec com-adobe-granite-auth-oauth-impl-bearer-authentication-handler-properties-data}))
