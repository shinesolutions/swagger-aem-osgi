(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-log-request-logger-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-log-request-logger-properties-data
  {
   (ds/opt :requestlogoutput) config-node-property-string-spec
   (ds/opt :requestlogoutputtype) config-node-property-drop-down-spec
   (ds/opt :requestlogenabled) config-node-property-boolean-spec
   (ds/opt :accesslogoutput) config-node-property-string-spec
   (ds/opt :accesslogoutputtype) config-node-property-drop-down-spec
   (ds/opt :accesslogenabled) config-node-property-boolean-spec
   })

(def org-apache-sling-engine-impl-log-request-logger-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-log-request-logger-properties
     :spec org-apache-sling-engine-impl-log-request-logger-properties-data}))
