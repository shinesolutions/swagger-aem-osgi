(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-properties-data
  {
   (ds/opt :davroot) config-node-property-string-spec
   (ds/opt :davcreate-absolute-uri) config-node-property-boolean-spec
   (ds/opt :davrealm) config-node-property-string-spec
   (ds/opt :collectiontypes) config-node-property-array-spec
   (ds/opt :filterprefixes) config-node-property-array-spec
   (ds/opt :filtertypes) config-node-property-string-spec
   (ds/opt :filteruris) config-node-property-string-spec
   (ds/opt :typecollections) config-node-property-string-spec
   (ds/opt :typenoncollections) config-node-property-string-spec
   (ds/opt :typecontent) config-node-property-string-spec
   })

(def org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-properties
     :spec org-apache-sling-jcr-webdav-impl-servlets-simple-web-dav-servlet-properties-data}))
