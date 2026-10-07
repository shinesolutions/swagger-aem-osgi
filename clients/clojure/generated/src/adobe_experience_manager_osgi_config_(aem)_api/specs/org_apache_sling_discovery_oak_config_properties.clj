(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-discovery-oak-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-discovery-oak-config-properties-data
  {
   (ds/opt :connectorPingTimeout) config-node-property-integer-spec
   (ds/opt :connectorPingInterval) config-node-property-integer-spec
   (ds/opt :discoveryLiteCheckInterval) config-node-property-integer-spec
   (ds/opt :clusterSyncServiceTimeout) config-node-property-integer-spec
   (ds/opt :clusterSyncServiceInterval) config-node-property-integer-spec
   (ds/opt :enableSyncToken) config-node-property-boolean-spec
   (ds/opt :minEventDelay) config-node-property-integer-spec
   (ds/opt :socketConnectTimeout) config-node-property-integer-spec
   (ds/opt :soTimeout) config-node-property-integer-spec
   (ds/opt :topologyConnectorUrls) config-node-property-array-spec
   (ds/opt :topologyConnectorWhitelist) config-node-property-array-spec
   (ds/opt :autoStopLocalLoopEnabled) config-node-property-boolean-spec
   (ds/opt :gzipConnectorRequestsEnabled) config-node-property-boolean-spec
   (ds/opt :hmacEnabled) config-node-property-boolean-spec
   (ds/opt :enableEncryption) config-node-property-boolean-spec
   (ds/opt :sharedKey) config-node-property-string-spec
   (ds/opt :hmacSharedKeyTTL) config-node-property-integer-spec
   (ds/opt :backoffStandbyFactor) config-node-property-string-spec
   (ds/opt :backoffStableFactor) config-node-property-string-spec
   })

(def org-apache-sling-discovery-oak-config-properties-spec
  (ds/spec
    {:name ::org-apache-sling-discovery-oak-config-properties
     :spec org-apache-sling-discovery-oak-config-properties-data}))
