(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-properties-data
  {
   (ds/opt :alias) config-node-property-string-spec
   (ds/opt :davcreate-absolute-uri) config-node-property-boolean-spec
   (ds/opt :davprotectedhandlers) config-node-property-string-spec
   })

(def org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-properties
     :spec org-apache-sling-jcr-davex-impl-servlets-sling-dav-ex-servlet-properties-data}))
