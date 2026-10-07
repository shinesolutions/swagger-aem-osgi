(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-properties-data
  {
   (ds/opt :javanamingfactoryinitial) config-node-property-string-spec
   (ds/opt :javanamingproviderurl) config-node-property-string-spec
   })

(def org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-properties
     :spec org-apache-sling-jcr-jackrabbit-server-jndi-registration-support-properties-data}))
