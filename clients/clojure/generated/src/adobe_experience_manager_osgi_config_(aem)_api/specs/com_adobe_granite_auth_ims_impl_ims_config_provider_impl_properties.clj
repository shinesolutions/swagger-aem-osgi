(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-ims-config-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-impl-ims-config-provider-impl-properties-data
  {
   (ds/opt :oauthconfigmanagerimsconfigid) config-node-property-string-spec
   (ds/opt :imsowningEntity) config-node-property-string-spec
   (ds/opt :aeminstanceId) config-node-property-string-spec
   (ds/opt :imsserviceCode) config-node-property-string-spec
   })

(def com-adobe-granite-auth-ims-impl-ims-config-provider-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-impl-ims-config-provider-impl-properties
     :spec com-adobe-granite-auth-ims-impl-ims-config-provider-impl-properties-data}))
