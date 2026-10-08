(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-eventing-thread-pool-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-eventing-thread-pool-properties-data
  {
   (ds/opt :minPoolSize) config-node-property-integer-spec
   })

(def org-apache-sling-event-impl-eventing-thread-pool-properties-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-eventing-thread-pool-properties
     :spec org-apache-sling-event-impl-eventing-thread-pool-properties-data}))
