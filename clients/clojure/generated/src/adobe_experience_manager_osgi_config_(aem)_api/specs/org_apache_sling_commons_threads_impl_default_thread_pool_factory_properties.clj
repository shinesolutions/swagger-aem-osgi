(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :minPoolSize) config-node-property-integer-spec
   (ds/opt :maxPoolSize) config-node-property-integer-spec
   (ds/opt :queueSize) config-node-property-integer-spec
   (ds/opt :maxThreadAge) config-node-property-integer-spec
   (ds/opt :keepAliveTime) config-node-property-integer-spec
   (ds/opt :blockPolicy) config-node-property-drop-down-spec
   (ds/opt :shutdownGraceful) config-node-property-boolean-spec
   (ds/opt :daemon) config-node-property-boolean-spec
   (ds/opt :shutdownWaitTime) config-node-property-integer-spec
   (ds/opt :priority) config-node-property-drop-down-spec
   })

(def org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties
     :spec org-apache-sling-commons-threads-impl-default-thread-pool-factory-properties-data}))
