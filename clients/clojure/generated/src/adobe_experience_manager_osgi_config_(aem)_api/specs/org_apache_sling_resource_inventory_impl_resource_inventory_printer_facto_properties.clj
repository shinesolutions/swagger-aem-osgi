(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties-data
  {
   (ds/opt :felixinventoryprintername) config-node-property-string-spec
   (ds/opt :felixinventoryprintertitle) config-node-property-string-spec
   (ds/opt :path) config-node-property-string-spec
   })

(def org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties-spec
  (ds/spec
    {:name ::org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties
     :spec org-apache-sling-resource-inventory-impl-resource-inventory-printer-facto-properties-data}))
