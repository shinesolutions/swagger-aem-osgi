(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-sso-impl-sso-authentication-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-sso-impl-sso-authentication-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :jaascontrolFlag) config-node-property-string-spec
   (ds/opt :jaasrealmName) config-node-property-string-spec
   (ds/opt :jaasranking) config-node-property-integer-spec
   (ds/opt :headers) config-node-property-array-spec
   (ds/opt :cookies) config-node-property-array-spec
   (ds/opt :parameters) config-node-property-array-spec
   (ds/opt :usermap) config-node-property-array-spec
   (ds/opt :format) config-node-property-string-spec
   (ds/opt :trustedCredentialsAttribute) config-node-property-string-spec
   })

(def com-adobe-granite-auth-sso-impl-sso-authentication-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-sso-impl-sso-authentication-handler-properties
     :spec com-adobe-granite-auth-sso-impl-sso-authentication-handler-properties-data}))
