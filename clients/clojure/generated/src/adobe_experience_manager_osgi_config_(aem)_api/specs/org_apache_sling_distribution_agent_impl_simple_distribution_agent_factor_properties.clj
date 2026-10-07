(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :title) config-node-property-string-spec
   (ds/opt :details) config-node-property-string-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :loglevel) config-node-property-drop-down-spec
   (ds/opt :queueprocessingenabled) config-node-property-boolean-spec
   (ds/opt :packageExportertarget) config-node-property-string-spec
   (ds/opt :packageImportertarget) config-node-property-string-spec
   (ds/opt :requestAuthorizationStrategytarget) config-node-property-string-spec
   (ds/opt :triggerstarget) config-node-property-string-spec
   })

(def org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-properties
     :spec org-apache-sling-distribution-agent-impl-simple-distribution-agent-factor-properties-data}))
