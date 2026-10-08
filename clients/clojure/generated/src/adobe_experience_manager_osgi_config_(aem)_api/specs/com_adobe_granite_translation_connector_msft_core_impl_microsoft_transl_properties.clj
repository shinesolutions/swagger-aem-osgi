(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-properties-data
  {
   (ds/opt :translationFactory) config-node-property-string-spec
   (ds/opt :defaultConnectorLabel) config-node-property-string-spec
   (ds/opt :defaultConnectorAttribution) config-node-property-string-spec
   (ds/opt :defaultConnectorWorkspaceId) config-node-property-string-spec
   (ds/opt :defaultConnectorSubscriptionKey) config-node-property-string-spec
   (ds/opt :languageMapLocation) config-node-property-string-spec
   (ds/opt :categoryMapLocation) config-node-property-string-spec
   (ds/opt :retryAttempts) config-node-property-integer-spec
   (ds/opt :timeoutCount) config-node-property-integer-spec
   })

(def com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-properties
     :spec com-adobe-granite-translation-connector-msft-core-impl-microsoft-transl-properties-data}))
