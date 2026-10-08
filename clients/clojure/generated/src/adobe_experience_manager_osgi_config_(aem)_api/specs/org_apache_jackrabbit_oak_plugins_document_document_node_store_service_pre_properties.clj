(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties-data
  {
   (ds/opt :persistentCacheIncludes) config-node-property-array-spec
   })

(def org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties
     :spec org-apache-jackrabbit-oak-plugins-document-document-node-store-service-pre-properties-data}))
