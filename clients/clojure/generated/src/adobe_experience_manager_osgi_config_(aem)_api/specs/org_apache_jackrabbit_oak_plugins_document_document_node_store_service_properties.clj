(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-document-document-node-store-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-properties-data
  {
   (ds/opt :mongouri) config-node-property-string-spec
   (ds/opt :db) config-node-property-string-spec
   (ds/opt :socketKeepAlive) config-node-property-boolean-spec
   (ds/opt :cache) config-node-property-integer-spec
   (ds/opt :nodeCachePercentage) config-node-property-integer-spec
   (ds/opt :prevDocCachePercentage) config-node-property-integer-spec
   (ds/opt :childrenCachePercentage) config-node-property-integer-spec
   (ds/opt :diffCachePercentage) config-node-property-integer-spec
   (ds/opt :cacheSegmentCount) config-node-property-integer-spec
   (ds/opt :cacheStackMoveDistance) config-node-property-integer-spec
   (ds/opt :blobCacheSize) config-node-property-integer-spec
   (ds/opt :persistentCache) config-node-property-string-spec
   (ds/opt :journalCache) config-node-property-string-spec
   (ds/opt :customBlobStore) config-node-property-boolean-spec
   (ds/opt :journalGCInterval) config-node-property-integer-spec
   (ds/opt :journalGCMaxAge) config-node-property-integer-spec
   (ds/opt :prefetchExternalChanges) config-node-property-boolean-spec
   (ds/opt :role) config-node-property-string-spec
   (ds/opt :versionGcMaxAgeInSecs) config-node-property-integer-spec
   (ds/opt :versionGCExpression) config-node-property-string-spec
   (ds/opt :versionGCTimeLimitInSecs) config-node-property-integer-spec
   (ds/opt :blobGcMaxAgeInSecs) config-node-property-integer-spec
   (ds/opt :blobTrackSnapshotIntervalInSecs) config-node-property-integer-spec
   (ds/opt :repositoryhome) config-node-property-string-spec
   (ds/opt :maxReplicationLagInSecs) config-node-property-integer-spec
   (ds/opt :documentStoreType) config-node-property-drop-down-spec
   (ds/opt :bundlingDisabled) config-node-property-boolean-spec
   (ds/opt :updateLimit) config-node-property-integer-spec
   (ds/opt :persistentCacheIncludes) config-node-property-array-spec
   (ds/opt :leaseCheckMode) config-node-property-drop-down-spec
   })

(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-document-document-node-store-service-properties
     :spec org-apache-jackrabbit-oak-plugins-document-document-node-store-service-properties-data}))
