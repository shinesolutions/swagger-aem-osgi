(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-datasource-jndi-data-source-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-datasource-jndi-data-source-factory-properties-data
  {
   (ds/opt :datasourcename) config-node-property-string-spec
   (ds/opt :datasourcesvcpropname) config-node-property-string-spec
   (ds/opt :datasourcejndiname) config-node-property-string-spec
   (ds/opt :jndiproperties) config-node-property-array-spec
   })

(def org-apache-sling-datasource-jndi-data-source-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-datasource-jndi-data-source-factory-properties
     :spec org-apache-sling-datasource-jndi-data-source-factory-properties-data}))
