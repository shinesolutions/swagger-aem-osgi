(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-repoinit-repository-initializer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-repoinit-repository-initializer-properties-data
  {
   (ds/opt :references) config-node-property-array-spec
   (ds/opt :scripts) config-node-property-array-spec
   })

(def org-apache-sling-jcr-repoinit-repository-initializer-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-repoinit-repository-initializer-properties
     :spec org-apache-sling-jcr-repoinit-repository-initializer-properties-data}))
