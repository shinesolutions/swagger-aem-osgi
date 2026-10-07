(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-properties-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-info
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-node-state-solr-servers-info-data}))
