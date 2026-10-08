(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties-data
  {
   (ds/opt :oauthproviderid) config-node-property-string-spec
   })

(def com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties
     :spec com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties-data}))
