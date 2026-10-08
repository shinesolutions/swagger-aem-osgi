(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-ims-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-impl-ims-provider-impl-properties-data
  {
   (ds/opt :oauthproviderid) config-node-property-string-spec
   (ds/opt :oauthproviderimsauthorizationurl) config-node-property-string-spec
   (ds/opt :oauthproviderimstokenurl) config-node-property-string-spec
   (ds/opt :oauthproviderimsprofileurl) config-node-property-string-spec
   (ds/opt :oauthproviderimsextendeddetailsurls) config-node-property-array-spec
   (ds/opt :oauthproviderimsvalidatetokenurl) config-node-property-string-spec
   (ds/opt :oauthproviderimssessionproperty) config-node-property-string-spec
   (ds/opt :oauthproviderimsservicetokenclientid) config-node-property-string-spec
   (ds/opt :oauthproviderimsservicetokenclientsecret) config-node-property-string-spec
   (ds/opt :oauthproviderimsservicetoken) config-node-property-string-spec
   (ds/opt :imsorgref) config-node-property-string-spec
   (ds/opt :imsgroupmapping) config-node-property-array-spec
   (ds/opt :oauthproviderimsonlylicensegroup) config-node-property-boolean-spec
   })

(def com-adobe-granite-auth-ims-impl-ims-provider-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-impl-ims-provider-impl-properties
     :spec com-adobe-granite-auth-ims-impl-ims-provider-impl-properties-data}))
