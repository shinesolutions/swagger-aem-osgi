(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-jobs-queue-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-jobs-queue-configuration-properties-data
  {
   (ds/opt :queuename) config-node-property-string-spec
   (ds/opt :queuetopics) config-node-property-array-spec
   (ds/opt :queuetype) config-node-property-drop-down-spec
   (ds/opt :queuepriority) config-node-property-drop-down-spec
   (ds/opt :queueretries) config-node-property-integer-spec
   (ds/opt :queueretrydelay) config-node-property-integer-spec
   (ds/opt :queuemaxparallel) config-node-property-float-spec
   (ds/opt :queuekeepJobs) config-node-property-boolean-spec
   (ds/opt :queuepreferRunOnCreationInstance) config-node-property-boolean-spec
   (ds/opt :queuethreadPoolSize) config-node-property-integer-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def org-apache-sling-event-jobs-queue-configuration-properties-spec
  (ds/spec
    {:name ::org-apache-sling-event-jobs-queue-configuration-properties
     :spec org-apache-sling-event-jobs-queue-configuration-properties-data}))
