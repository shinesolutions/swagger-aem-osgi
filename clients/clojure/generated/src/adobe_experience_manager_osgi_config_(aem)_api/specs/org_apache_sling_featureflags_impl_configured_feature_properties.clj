(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-featureflags-impl-configured-feature-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-featureflags-impl-configured-feature-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :description) config-node-property-string-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def org-apache-sling-featureflags-impl-configured-feature-properties-spec
  (ds/spec
    {:name ::org-apache-sling-featureflags-impl-configured-feature-properties
     :spec org-apache-sling-featureflags-impl-configured-feature-properties-data}))
