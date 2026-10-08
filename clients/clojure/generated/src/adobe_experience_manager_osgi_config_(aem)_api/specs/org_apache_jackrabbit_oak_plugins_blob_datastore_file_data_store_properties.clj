(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties
     :spec org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties-data}))
