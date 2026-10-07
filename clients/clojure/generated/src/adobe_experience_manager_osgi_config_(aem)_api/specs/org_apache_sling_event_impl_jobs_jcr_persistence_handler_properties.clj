(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-jcr-persistence-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-jobs-jcr-persistence-handler-properties-data
  {
   (ds/opt :jobconsumermanagerdisableDistribution) config-node-property-boolean-spec
   (ds/opt :startupdelay) config-node-property-integer-spec
   (ds/opt :cleanupperiod) config-node-property-integer-spec
   })

(def org-apache-sling-event-impl-jobs-jcr-persistence-handler-properties-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-jobs-jcr-persistence-handler-properties
     :spec org-apache-sling-event-impl-jobs-jcr-persistence-handler-properties-data}))
