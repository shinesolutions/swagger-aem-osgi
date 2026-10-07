(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :userId) config-node-property-string-spec
   (ds/opt :accessTokenProvidertarget) config-node-property-string-spec
   })

(def com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties
     :spec com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties-data}))
