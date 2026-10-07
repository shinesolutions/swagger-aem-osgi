(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties-data
  {
   (ds/opt :disabled) config-node-property-boolean-spec
   (ds/opt :debug) config-node-property-boolean-spec
   (ds/opt :localIndexDir) config-node-property-string-spec
   (ds/opt :enableOpenIndexAsync) config-node-property-boolean-spec
   (ds/opt :threadPoolSize) config-node-property-integer-spec
   (ds/opt :prefetchIndexFiles) config-node-property-boolean-spec
   (ds/opt :extractedTextCacheSizeInMB) config-node-property-integer-spec
   (ds/opt :extractedTextCacheExpiryInSecs) config-node-property-integer-spec
   (ds/opt :alwaysUsePreExtractedCache) config-node-property-boolean-spec
   (ds/opt :booleanClauseLimit) config-node-property-integer-spec
   (ds/opt :enableHybridIndexing) config-node-property-boolean-spec
   (ds/opt :hybridQueueSize) config-node-property-integer-spec
   (ds/opt :disableStoredIndexDefinition) config-node-property-boolean-spec
   (ds/opt :deletedBlobsCollectionEnabled) config-node-property-boolean-spec
   (ds/opt :propIndexCleanerIntervalInSecs) config-node-property-integer-spec
   (ds/opt :enableSingleBlobIndexFiles) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties
     :spec org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties-data}))
