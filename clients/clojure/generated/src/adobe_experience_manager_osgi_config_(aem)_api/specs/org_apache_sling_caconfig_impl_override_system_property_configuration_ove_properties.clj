(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-override-system-property-configuration-ove-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-impl-override-system-property-configuration-ove-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def org-apache-sling-caconfig-impl-override-system-property-configuration-ove-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-impl-override-system-property-configuration-ove-properties
     :spec org-apache-sling-caconfig-impl-override-system-property-configuration-ove-properties-data}))
