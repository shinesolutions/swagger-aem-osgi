(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-settings-impl-sling-settings-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-settings-impl-sling-settings-service-impl-properties-data
  {
   (ds/opt :slingname) config-node-property-string-spec
   (ds/opt :slingdescription) config-node-property-string-spec
   })

(def org-apache-sling-settings-impl-sling-settings-service-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-settings-impl-sling-settings-service-impl-properties
     :spec org-apache-sling-settings-impl-sling-settings-service-impl-properties-data}))
