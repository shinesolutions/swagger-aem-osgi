(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties-data}))
