(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-http-sslfilter-ssl-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-http-sslfilter-ssl-filter-properties-data
  {
   (ds/opt :ssl-forwardheader) config-node-property-string-spec
   (ds/opt :ssl-forwardvalue) config-node-property-string-spec
   (ds/opt :ssl-forward-certheader) config-node-property-string-spec
   (ds/opt :rewriteabsoluteurls) config-node-property-boolean-spec
   })

(def org-apache-felix-http-sslfilter-ssl-filter-properties-spec
  (ds/spec
    {:name ::org-apache-felix-http-sslfilter-ssl-filter-properties
     :spec org-apache-felix-http-sslfilter-ssl-filter-properties-data}))
