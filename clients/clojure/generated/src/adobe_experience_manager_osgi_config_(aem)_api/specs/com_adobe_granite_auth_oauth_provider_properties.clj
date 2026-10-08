(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-oauth-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-oauth-provider-properties-data
  {
   (ds/opt :oauthconfigid) config-node-property-string-spec
   (ds/opt :oauthclientid) config-node-property-string-spec
   (ds/opt :oauthclientsecret) config-node-property-string-spec
   (ds/opt :oauthscope) config-node-property-array-spec
   (ds/opt :oauthconfigproviderid) config-node-property-string-spec
   (ds/opt :oauthcreateusers) config-node-property-boolean-spec
   (ds/opt :oauthuseridproperty) config-node-property-string-spec
   (ds/opt :forcestrictusernamematching) config-node-property-boolean-spec
   (ds/opt :oauthencodeuserids) config-node-property-boolean-spec
   (ds/opt :oauthhashuserids) config-node-property-boolean-spec
   (ds/opt :oauthcallBackUrl) config-node-property-string-spec
   (ds/opt :oauthaccesstokenpersist) config-node-property-boolean-spec
   (ds/opt :oauthaccesstokenpersistcookie) config-node-property-boolean-spec
   (ds/opt :oauthcsrfstateprotection) config-node-property-boolean-spec
   (ds/opt :oauthredirectrequestparams) config-node-property-boolean-spec
   (ds/opt :oauthconfigsiblingsallow) config-node-property-boolean-spec
   })

(def com-adobe-granite-auth-oauth-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-oauth-provider-properties
     :spec com-adobe-granite-auth-oauth-provider-properties-data}))
