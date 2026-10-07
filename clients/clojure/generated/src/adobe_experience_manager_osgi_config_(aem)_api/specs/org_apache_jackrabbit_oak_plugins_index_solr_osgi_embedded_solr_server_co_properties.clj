(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-properties-data
  {
   (ds/opt :solrhomepath) config-node-property-string-spec
   (ds/opt :solrcorename) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-properties
     :spec org-apache-jackrabbit-oak-plugins-index-solr-osgi-embedded-solr-server-co-properties-data}))
