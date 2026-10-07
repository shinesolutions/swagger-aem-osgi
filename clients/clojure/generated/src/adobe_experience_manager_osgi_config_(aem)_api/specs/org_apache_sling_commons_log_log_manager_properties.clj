(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-log-log-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-log-log-manager-properties-data
  {
   (ds/opt :orgapacheslingcommonsloglevel) config-node-property-drop-down-spec
   (ds/opt :orgapacheslingcommonslogfile) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogfilenumber) config-node-property-integer-spec
   (ds/opt :orgapacheslingcommonslogfilesize) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogpattern) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogconfigurationFile) config-node-property-string-spec
   (ds/opt :orgapacheslingcommonslogpackagingDataEnabled) config-node-property-boolean-spec
   (ds/opt :orgapacheslingcommonslogmaxCallerDataDepth) config-node-property-integer-spec
   (ds/opt :orgapacheslingcommonslogmaxOldFileCountInDump) config-node-property-integer-spec
   (ds/opt :orgapacheslingcommonslognumOfLines) config-node-property-integer-spec
   })

(def org-apache-sling-commons-log-log-manager-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-log-log-manager-properties
     :spec org-apache-sling-commons-log-log-manager-properties-data}))
