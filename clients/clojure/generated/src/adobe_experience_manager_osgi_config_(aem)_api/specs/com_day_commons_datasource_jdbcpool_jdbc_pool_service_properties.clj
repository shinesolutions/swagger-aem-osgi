(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties-data
  {
   (ds/opt :jdbcdriverclass) config-node-property-string-spec
   (ds/opt :jdbcconnectionuri) config-node-property-string-spec
   (ds/opt :jdbcusername) config-node-property-string-spec
   (ds/opt :jdbcpassword) config-node-property-string-spec
   (ds/opt :jdbcvalidationquery) config-node-property-string-spec
   (ds/opt :defaultreadonly) config-node-property-boolean-spec
   (ds/opt :defaultautocommit) config-node-property-boolean-spec
   (ds/opt :poolsize) config-node-property-integer-spec
   (ds/opt :poolmaxwaitmsec) config-node-property-integer-spec
   (ds/opt :datasourcename) config-node-property-string-spec
   (ds/opt :datasourcesvcproperties) config-node-property-array-spec
   })

(def com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties-spec
  (ds/spec
    {:name ::com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties
     :spec com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties-data}))
