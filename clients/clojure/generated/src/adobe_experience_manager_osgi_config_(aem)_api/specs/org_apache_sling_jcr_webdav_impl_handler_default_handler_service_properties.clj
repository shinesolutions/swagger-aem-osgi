(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-webdav-impl-handler-default-handler-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-webdav-impl-handler-default-handler-service-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :typecollections) config-node-property-string-spec
   (ds/opt :typenoncollections) config-node-property-string-spec
   (ds/opt :typecontent) config-node-property-string-spec
   })

(def org-apache-sling-jcr-webdav-impl-handler-default-handler-service-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-webdav-impl-handler-default-handler-service-properties
     :spec org-apache-sling-jcr-webdav-impl-handler-default-handler-service-properties-data}))
