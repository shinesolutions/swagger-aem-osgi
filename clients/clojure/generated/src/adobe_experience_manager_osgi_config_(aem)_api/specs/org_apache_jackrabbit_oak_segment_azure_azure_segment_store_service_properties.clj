(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-properties-data
  {
   (ds/opt :accountName) config-node-property-string-spec
   (ds/opt :containerName) config-node-property-string-spec
   (ds/opt :accessKey) config-node-property-string-spec
   (ds/opt :rootPath) config-node-property-string-spec
   (ds/opt :connectionURL) config-node-property-string-spec
   })

(def org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-properties
     :spec org-apache-jackrabbit-oak-segment-azure-azure-segment-store-service-properties-data}))
