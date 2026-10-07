(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :ignoredPathsPatterns) config-node-property-array-spec
   (ds/opt :serviceName) config-node-property-string-spec
   (ds/opt :deep) config-node-property-boolean-spec
   })

(def org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-properties
     :spec org-apache-sling-distribution-trigger-impl-jcr-event-distribution-trigger-properties-data}))
