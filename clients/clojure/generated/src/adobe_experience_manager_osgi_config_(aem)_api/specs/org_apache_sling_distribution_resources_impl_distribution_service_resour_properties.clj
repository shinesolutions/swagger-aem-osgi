(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-resources-impl-distribution-service-resour-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-resources-impl-distribution-service-resour-properties-data
  {
   (ds/opt :providerroots) config-node-property-string-spec
   (ds/opt :kind) config-node-property-string-spec
   })

(def org-apache-sling-distribution-resources-impl-distribution-service-resour-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-resources-impl-distribution-service-resour-properties
     :spec org-apache-sling-distribution-resources-impl-distribution-service-resour-properties-data}))
