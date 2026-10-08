(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-accesstoken-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-accesstoken-provider-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :authtokenprovidertitle) config-node-property-string-spec
   (ds/opt :authtokenproviderdefaultclaims) config-node-property-array-spec
   (ds/opt :authtokenproviderendpoint) config-node-property-string-spec
   (ds/opt :authaccesstokenrequest) config-node-property-string-spec
   (ds/opt :authtokenproviderkeypairalias) config-node-property-string-spec
   (ds/opt :authtokenproviderconntimeout) config-node-property-integer-spec
   (ds/opt :authtokenprovidersotimeout) config-node-property-integer-spec
   (ds/opt :authtokenproviderclientid) config-node-property-string-spec
   (ds/opt :authtokenproviderscope) config-node-property-string-spec
   (ds/opt :authtokenproviderreuseaccesstoken) config-node-property-boolean-spec
   (ds/opt :authtokenproviderrelaxedssl) config-node-property-boolean-spec
   (ds/opt :tokenrequestcustomizertype) config-node-property-string-spec
   (ds/opt :authtokenvalidatortype) config-node-property-string-spec
   })

(def com-adobe-granite-auth-oauth-accesstoken-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-accesstoken-provider-properties
     :spec com-adobe-granite-auth-oauth-accesstoken-provider-properties-data}))
