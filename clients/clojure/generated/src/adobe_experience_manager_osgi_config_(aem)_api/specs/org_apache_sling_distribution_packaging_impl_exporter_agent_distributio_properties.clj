(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :queue) config-node-property-string-spec
   (ds/opt :dropinvaliditems) config-node-property-boolean-spec
   (ds/opt :agenttarget) config-node-property-string-spec
   })

(def org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties
     :spec org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties-data}))
