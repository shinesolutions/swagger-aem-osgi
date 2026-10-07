(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-properties-data
  {
   (ds/opt :slingservletpaths) config-node-property-string-spec
   (ds/opt :oauthrevocationactive) config-node-property-boolean-spec
   })

(def com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-properties
     :spec com-adobe-granite-oauth-server-impl-o-auth2-revocation-endpoint-servlet-properties-data}))
