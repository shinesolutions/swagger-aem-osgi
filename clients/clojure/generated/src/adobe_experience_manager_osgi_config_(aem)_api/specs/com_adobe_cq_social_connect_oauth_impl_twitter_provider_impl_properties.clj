(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-properties-data
  {
   (ds/opt :oauthproviderid) config-node-property-string-spec
   (ds/opt :oauthcloudconfigroot) config-node-property-string-spec
   (ds/opt :providerconfigroot) config-node-property-string-spec
   (ds/opt :providerconfiguserfolder) config-node-property-drop-down-spec
   (ds/opt :providerconfigtwitterenableparams) config-node-property-boolean-spec
   (ds/opt :providerconfigtwitterparams) config-node-property-array-spec
   (ds/opt :providerconfigrefreshuserdataenabled) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-properties
     :spec com-adobe-cq-social-connect-oauth-impl-twitter-provider-impl-properties-data}))
