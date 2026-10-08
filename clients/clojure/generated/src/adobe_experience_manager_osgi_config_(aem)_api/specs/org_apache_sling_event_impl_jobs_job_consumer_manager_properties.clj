(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-job-consumer-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-jobs-job-consumer-manager-properties-data
  {
   (ds/opt :orgapacheslinginstallerconfigurationpersist) config-node-property-boolean-spec
   (ds/opt :jobconsumermanagerwhitelist) config-node-property-array-spec
   (ds/opt :jobconsumermanagerblacklist) config-node-property-array-spec
   })

(def org-apache-sling-event-impl-jobs-job-consumer-manager-properties-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-jobs-job-consumer-manager-properties
     :spec org-apache-sling-event-impl-jobs-job-consumer-manager-properties-data}))
