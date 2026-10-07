(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :checkpathprefix) config-node-property-string-spec
   (ds/opt :jcrPath) config-node-property-string-spec
   })

(def org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-properties
     :spec org-apache-sling-jcr-resourcesecurity-impl-resource-access-gate-factory-properties-data}))
