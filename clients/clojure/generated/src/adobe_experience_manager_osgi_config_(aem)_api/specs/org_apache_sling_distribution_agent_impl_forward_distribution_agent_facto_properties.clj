(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :title) config-node-property-string-spec
   (ds/opt :details) config-node-property-string-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :loglevel) config-node-property-drop-down-spec
   (ds/opt :allowedroots) config-node-property-array-spec
   (ds/opt :queueprocessingenabled) config-node-property-boolean-spec
   (ds/opt :packageImporterendpoints) config-node-property-array-spec
   (ds/opt :passiveQueues) config-node-property-array-spec
   (ds/opt :priorityQueues) config-node-property-array-spec
   (ds/opt :retrystrategy) config-node-property-drop-down-spec
   (ds/opt :retryattempts) config-node-property-integer-spec
   (ds/opt :requestAuthorizationStrategytarget) config-node-property-string-spec
   (ds/opt :transportSecretProvidertarget) config-node-property-string-spec
   (ds/opt :packageBuildertarget) config-node-property-string-spec
   (ds/opt :triggerstarget) config-node-property-string-spec
   (ds/opt :queueprovider) config-node-property-drop-down-spec
   (ds/opt :asyncdelivery) config-node-property-boolean-spec
   (ds/opt :httpconntimeout) config-node-property-integer-spec
   })

(def org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-properties
     :spec org-apache-sling-distribution-agent-impl-forward-distribution-agent-facto-properties-data}))
