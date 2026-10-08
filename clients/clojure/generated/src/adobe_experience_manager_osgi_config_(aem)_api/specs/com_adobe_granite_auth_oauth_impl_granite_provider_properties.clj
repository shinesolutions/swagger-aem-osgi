(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-granite-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-granite-provider-properties-data
  {
   (ds/opt :oauthproviderid) config-node-property-string-spec
   (ds/opt :oauthprovidergraniteauthorizationurl) config-node-property-string-spec
   (ds/opt :oauthprovidergranitetokenurl) config-node-property-string-spec
   (ds/opt :oauthprovidergraniteprofileurl) config-node-property-string-spec
   (ds/opt :oauthprovidergraniteextendeddetailsurls) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-impl-granite-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-granite-provider-properties
     :spec com-adobe-granite-auth-oauth-impl-granite-provider-properties-data}))
