(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-user-impl-transport-http-to-publisher-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-user-impl-transport-http-to-publisher-properties-data
  {
   (ds/opt :enable) config-node-property-boolean-spec
   (ds/opt :agentconfiguration) config-node-property-array-spec
   (ds/opt :contextpath) config-node-property-string-spec
   (ds/opt :disabledciphersuites) config-node-property-array-spec
   (ds/opt :enabledciphersuites) config-node-property-array-spec
   })

(def com-adobe-cq-social-user-impl-transport-http-to-publisher-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-user-impl-transport-http-to-publisher-properties
     :spec com-adobe-cq-social-user-impl-transport-http-to-publisher-properties-data}))
