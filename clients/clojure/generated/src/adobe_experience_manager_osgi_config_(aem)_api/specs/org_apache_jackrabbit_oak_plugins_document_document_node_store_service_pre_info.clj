(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-info
     :spec org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-info-data}))
