(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   })

(def org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties
     :spec org-apache-sling-caconfig-impl-def-default-configuration-persistence-stra-properties-data}))
