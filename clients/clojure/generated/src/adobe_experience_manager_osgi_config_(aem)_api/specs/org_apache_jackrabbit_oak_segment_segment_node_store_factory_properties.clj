(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-segment-segment-node-store-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-segment-segment-node-store-factory-properties-data
  {
   (ds/opt :repositoryhome) config-node-property-string-spec
   (ds/opt :tarmkmode) config-node-property-string-spec
   (ds/opt :tarmksize) config-node-property-integer-spec
   (ds/opt :segmentCachesize) config-node-property-integer-spec
   (ds/opt :stringCachesize) config-node-property-integer-spec
   (ds/opt :templateCachesize) config-node-property-integer-spec
   (ds/opt :stringDeduplicationCachesize) config-node-property-integer-spec
   (ds/opt :templateDeduplicationCachesize) config-node-property-integer-spec
   (ds/opt :nodeDeduplicationCachesize) config-node-property-integer-spec
   (ds/opt :pauseCompaction) config-node-property-boolean-spec
   (ds/opt :compactionretryCount) config-node-property-integer-spec
   (ds/opt :compactionforcetimeout) config-node-property-integer-spec
   (ds/opt :compactionsizeDeltaEstimation) config-node-property-integer-spec
   (ds/opt :compactiondisableEstimation) config-node-property-boolean-spec
   (ds/opt :compactionretainedGenerations) config-node-property-integer-spec
   (ds/opt :compactionmemoryThreshold) config-node-property-integer-spec
   (ds/opt :compactionprogressLog) config-node-property-integer-spec
   (ds/opt :standby) config-node-property-boolean-spec
   (ds/opt :customBlobStore) config-node-property-boolean-spec
   (ds/opt :customSegmentStore) config-node-property-boolean-spec
   (ds/opt :splitPersistence) config-node-property-boolean-spec
   (ds/opt :repositorybackupdir) config-node-property-string-spec
   (ds/opt :blobGcMaxAgeInSecs) config-node-property-integer-spec
   (ds/opt :blobTrackSnapshotIntervalInSecs) config-node-property-integer-spec
   (ds/opt :role) config-node-property-string-spec
   (ds/opt :registerDescriptors) config-node-property-boolean-spec
   (ds/opt :dispatchChanges) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-segment-segment-node-store-factory-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-segment-segment-node-store-factory-properties
     :spec org-apache-jackrabbit-oak-segment-segment-node-store-factory-properties-data}))
