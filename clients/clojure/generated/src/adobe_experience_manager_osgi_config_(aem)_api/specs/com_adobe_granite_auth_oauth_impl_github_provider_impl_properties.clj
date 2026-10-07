(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-github-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-github-provider-impl-properties-data
  {
   (ds/opt :oauthproviderid) config-node-property-string-spec
   (ds/opt :oauthprovidergithubauthorizationurl) config-node-property-string-spec
   (ds/opt :oauthprovidergithubtokenurl) config-node-property-string-spec
   (ds/opt :oauthprovidergithubprofileurl) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-impl-github-provider-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-github-provider-impl-properties
     :spec com-adobe-granite-auth-oauth-impl-github-provider-impl-properties-data}))
