(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-trigger-impl-distribution-event-distribute-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-trigger-impl-distribution-event-distribute-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :path) config-node-property-string-spec
   })

(def org-apache-sling-distribution-trigger-impl-distribution-event-distribute-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-trigger-impl-distribution-event-distribute-properties
     :spec org-apache-sling-distribution-trigger-impl-distribution-event-distribute-properties-data}))
