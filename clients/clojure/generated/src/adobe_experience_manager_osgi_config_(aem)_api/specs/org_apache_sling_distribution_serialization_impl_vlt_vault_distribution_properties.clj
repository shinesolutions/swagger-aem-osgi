(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :type) config-node-property-drop-down-spec
   (ds/opt :importMode) config-node-property-string-spec
   (ds/opt :aclHandling) config-node-property-string-spec
   (ds/opt :packageroots) config-node-property-string-spec
   (ds/opt :packagefilters) config-node-property-array-spec
   (ds/opt :propertyfilters) config-node-property-array-spec
   (ds/opt :tempFsFolder) config-node-property-string-spec
   (ds/opt :useBinaryReferences) config-node-property-boolean-spec
   (ds/opt :autoSaveThreshold) config-node-property-integer-spec
   (ds/opt :cleanupDelay) config-node-property-integer-spec
   (ds/opt :fileThreshold) config-node-property-integer-spec
   (ds/opt :MEGA_BYTES) config-node-property-drop-down-spec
   (ds/opt :useOffHeapMemory) config-node-property-boolean-spec
   (ds/opt :digestAlgorithm) config-node-property-drop-down-spec
   (ds/opt :monitoringQueueSize) config-node-property-integer-spec
   (ds/opt :pathsMapping) config-node-property-array-spec
   (ds/opt :strictImport) config-node-property-boolean-spec
   })

(def org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-properties
     :spec org-apache-sling-distribution-serialization-impl-vlt-vault-distribution-properties-data}))
