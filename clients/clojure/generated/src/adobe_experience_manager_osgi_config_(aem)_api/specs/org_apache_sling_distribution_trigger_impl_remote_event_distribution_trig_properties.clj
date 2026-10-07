(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :endpoint) config-node-property-string-spec
   (ds/opt :transportSecretProvidertarget) config-node-property-string-spec
   })

(def org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties
     :spec org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties-data}))
