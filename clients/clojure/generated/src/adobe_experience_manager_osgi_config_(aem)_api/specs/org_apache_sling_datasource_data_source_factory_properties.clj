(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-datasource-data-source-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-datasource-data-source-factory-properties-data
  {
   (ds/opt :datasourcename) config-node-property-string-spec
   (ds/opt :datasourcesvcpropname) config-node-property-string-spec
   (ds/opt :driverClassName) config-node-property-string-spec
   (ds/opt :url) config-node-property-string-spec
   (ds/opt :username) config-node-property-string-spec
   (ds/opt :password) config-node-property-string-spec
   (ds/opt :defaultAutoCommit) config-node-property-drop-down-spec
   (ds/opt :defaultReadOnly) config-node-property-drop-down-spec
   (ds/opt :defaultTransactionIsolation) config-node-property-drop-down-spec
   (ds/opt :defaultCatalog) config-node-property-string-spec
   (ds/opt :maxActive) config-node-property-integer-spec
   (ds/opt :maxIdle) config-node-property-integer-spec
   (ds/opt :minIdle) config-node-property-integer-spec
   (ds/opt :initialSize) config-node-property-integer-spec
   (ds/opt :maxWait) config-node-property-integer-spec
   (ds/opt :maxAge) config-node-property-integer-spec
   (ds/opt :testOnBorrow) config-node-property-boolean-spec
   (ds/opt :testOnReturn) config-node-property-boolean-spec
   (ds/opt :testWhileIdle) config-node-property-boolean-spec
   (ds/opt :validationQuery) config-node-property-string-spec
   (ds/opt :validationQueryTimeout) config-node-property-integer-spec
   (ds/opt :timeBetweenEvictionRunsMillis) config-node-property-integer-spec
   (ds/opt :minEvictableIdleTimeMillis) config-node-property-integer-spec
   (ds/opt :connectionProperties) config-node-property-string-spec
   (ds/opt :initSQL) config-node-property-string-spec
   (ds/opt :jdbcInterceptors) config-node-property-string-spec
   (ds/opt :validationInterval) config-node-property-integer-spec
   (ds/opt :logValidationErrors) config-node-property-boolean-spec
   (ds/opt :datasourcesvcproperties) config-node-property-array-spec
   })

(def org-apache-sling-datasource-data-source-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-datasource-data-source-factory-properties
     :spec org-apache-sling-datasource-data-source-factory-properties-data}))
