(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties-data
  {
   (ds/opt :preservehierarchynodes) config-node-property-boolean-spec
   (ds/opt :ignoreversioning) config-node-property-boolean-spec
   (ds/opt :importacl) config-node-property-boolean-spec
   (ds/opt :savethreshold) config-node-property-integer-spec
   (ds/opt :preserveuserpaths) config-node-property-boolean-spec
   (ds/opt :preserveuuid) config-node-property-boolean-spec
   (ds/opt :preserveuuidnodetypes) config-node-property-array-spec
   (ds/opt :preserveuuidsubtrees) config-node-property-array-spec
   (ds/opt :autocommit) config-node-property-boolean-spec
   })

(def com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties-spec
  (ds/spec
    {:name ::com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties
     :spec com-day-cq-replication-impl-content-durbo-durbo-import-configuration-prov-properties-data}))
