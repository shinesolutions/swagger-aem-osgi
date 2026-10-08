(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-writer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-log-log-manager-factory-writer-properties-data
  {
   (ds/opt :orgapacheslingcommonslogfile) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogfilenumber) config-node-property-integer-spec
   (ds/opt :orgapacheslingcommonslogfilesize) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogfilebuffered) config-node-property-boolean-spec
   })

(def org-apache-sling-commons-log-log-manager-factory-writer-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-log-log-manager-factory-writer-properties
     :spec org-apache-sling-commons-log-log-manager-factory-writer-properties-data}))
