(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-properties-data
  {
   (ds/opt :servertype) config-node-property-drop-down-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-properties
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-solr-server-provider-se-properties-data}))
