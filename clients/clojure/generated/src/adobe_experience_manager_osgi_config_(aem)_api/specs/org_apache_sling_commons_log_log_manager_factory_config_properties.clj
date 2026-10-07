(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-factory-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-log-log-manager-factory-config-properties-data
  {
   (ds/opt :orgapacheslingcommonsloglevel) config-node-property-drop-down-spec
   (ds/opt :orgapacheslingcommonslogfile) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogpattern) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslognames) config-node-property-array-spec
   (ds/opt :orgapacheslingcommonslogadditiv) config-node-property-boolean-spec
   })

(def org-apache-sling-commons-log-log-manager-factory-config-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-log-log-manager-factory-config-properties
     :spec org-apache-sling-commons-log-log-manager-factory-config-properties-data}))
