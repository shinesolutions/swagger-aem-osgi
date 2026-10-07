(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-properties-data
  {
   (ds/opt :solrhttpurl) config-node-property-string-spec
   (ds/opt :solrzkhost) config-node-property-string-spec
   (ds/opt :solrcollection) config-node-property-string-spec
   (ds/opt :solrsockettimeout) config-node-property-integer-spec
   (ds/opt :solrconnectiontimeout) config-node-property-integer-spec
   (ds/opt :solrshardsno) config-node-property-integer-spec
   (ds/opt :solrreplicationfactor) config-node-property-integer-spec
   (ds/opt :solrconfdir) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-properties
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-remote-solr-server-conf-properties-data}))
