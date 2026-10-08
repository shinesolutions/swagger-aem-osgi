(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-saml-saml-authentication-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-saml-saml-authentication-handler-properties-data
  {
   (ds/opt :path) config-node-property-array-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :idpUrl) config-node-property-string-spec
   (ds/opt :idpCertAlias) config-node-property-string-spec
   (ds/opt :idpHttpRedirect) config-node-property-boolean-spec
   (ds/opt :serviceProviderEntityId) config-node-property-string-spec
   (ds/opt :assertionConsumerServiceURL) config-node-property-string-spec
   (ds/opt :spPrivateKeyAlias) config-node-property-string-spec
   (ds/opt :keyStorePassword) config-node-property-string-spec
   (ds/opt :defaultRedirectUrl) config-node-property-string-spec
   (ds/opt :userIDAttribute) config-node-property-string-spec
   (ds/opt :useEncryption) config-node-property-boolean-spec
   (ds/opt :createUser) config-node-property-boolean-spec
   (ds/opt :userIntermediatePath) config-node-property-string-spec
   (ds/opt :addGroupMemberships) config-node-property-boolean-spec
   (ds/opt :groupMembershipAttribute) config-node-property-string-spec
   (ds/opt :defaultGroups) config-node-property-array-spec
   (ds/opt :nameIdFormat) config-node-property-string-spec
   (ds/opt :synchronizeAttributes) config-node-property-array-spec
   (ds/opt :handleLogout) config-node-property-boolean-spec
   (ds/opt :logoutUrl) config-node-property-string-spec
   (ds/opt :clockTolerance) config-node-property-integer-spec
   (ds/opt :digestMethod) config-node-property-string-spec
   (ds/opt :signatureMethod) config-node-property-string-spec
   (ds/opt :identitySyncType) config-node-property-drop-down-spec
   (ds/opt :idpIdentifier) config-node-property-string-spec
   })

(def com-adobe-granite-auth-saml-saml-authentication-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-saml-saml-authentication-handler-properties
     :spec com-adobe-granite-auth-saml-saml-authentication-handler-properties-data}))
