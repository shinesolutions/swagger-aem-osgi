(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-info
     :spec org-apache-jackrabbit-oak-plugins-blob-datastore-file-data-store-info-data}))
