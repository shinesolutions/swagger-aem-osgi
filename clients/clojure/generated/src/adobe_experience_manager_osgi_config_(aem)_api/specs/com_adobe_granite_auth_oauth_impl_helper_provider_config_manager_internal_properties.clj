(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-properties-data
  {
   (ds/opt :oauthcookielogintimeout) config-node-property-string-spec
   (ds/opt :oauthcookiemaxage) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-properties
     :spec com-adobe-granite-auth-oauth-impl-helper-provider-config-manager-internal-properties-data}))
