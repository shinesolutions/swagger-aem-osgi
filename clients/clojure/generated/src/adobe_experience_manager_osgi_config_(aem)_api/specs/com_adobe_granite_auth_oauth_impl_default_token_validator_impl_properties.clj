(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties-data
  {
   (ds/opt :authtokenvalidatortype) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties
     :spec com-adobe-granite-auth-oauth-impl-default-token-validator-impl-properties-data}))
