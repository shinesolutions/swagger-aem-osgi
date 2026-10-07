(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-default-job-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-jobs-default-job-manager-properties-data
  {
   (ds/opt :queuepriority) config-node-property-drop-down-spec
   (ds/opt :queueretries) config-node-property-integer-spec
   (ds/opt :queueretrydelay) config-node-property-integer-spec
   (ds/opt :queuemaxparallel) config-node-property-integer-spec
   })

(def org-apache-sling-event-impl-jobs-default-job-manager-properties-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-jobs-default-job-manager-properties
     :spec org-apache-sling-event-impl-jobs-default-job-manager-properties-data}))
