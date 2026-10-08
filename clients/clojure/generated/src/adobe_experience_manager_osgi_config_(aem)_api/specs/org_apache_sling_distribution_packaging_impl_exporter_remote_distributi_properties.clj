(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :endpoints) config-node-property-array-spec
   (ds/opt :pullitems) config-node-property-integer-spec
   (ds/opt :packageBuildertarget) config-node-property-string-spec
   (ds/opt :transportSecretProvidertarget) config-node-property-string-spec
   })

(def org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-properties
     :spec org-apache-sling-distribution-packaging-impl-exporter-remote-distributi-properties-data}))
