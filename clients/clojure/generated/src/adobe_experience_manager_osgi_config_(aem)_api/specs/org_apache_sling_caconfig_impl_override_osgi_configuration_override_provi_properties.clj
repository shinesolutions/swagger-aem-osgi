(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-properties-data
  {
   (ds/opt :description) config-node-property-string-spec
   (ds/opt :overrides) config-node-property-array-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-properties
     :spec org-apache-sling-caconfig-impl-override-osgi-configuration-override-provi-properties-data}))
