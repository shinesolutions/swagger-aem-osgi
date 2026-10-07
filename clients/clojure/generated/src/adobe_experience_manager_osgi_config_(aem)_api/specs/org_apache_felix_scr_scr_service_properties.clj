(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-scr-scr-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-scr-scr-service-properties-data
  {
   (ds/opt :dsloglevel) config-node-property-drop-down-spec
   (ds/opt :dsfactoryenabled) config-node-property-boolean-spec
   (ds/opt :dsdelayedkeepInstances) config-node-property-boolean-spec
   (ds/opt :dslocktimeoutmilliseconds) config-node-property-integer-spec
   (ds/opt :dsstoptimeoutmilliseconds) config-node-property-integer-spec
   (ds/opt :dsglobalextender) config-node-property-boolean-spec
   })

(def org-apache-felix-scr-scr-service-properties-spec
  (ds/spec
    {:name ::org-apache-felix-scr-scr-service-properties
     :spec org-apache-felix-scr-scr-service-properties-data}))
