(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-impl-framework-start-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-impl-framework-start-check-properties-data
  {
   (ds/opt :timeout) config-node-property-integer-spec
   (ds/opt :targetstartlevel) config-node-property-integer-spec
   (ds/opt :targetstartlevelpropname) config-node-property-string-spec
   (ds/opt :type) config-node-property-drop-down-spec
   })

(def org-apache-felix-systemready-impl-framework-start-check-properties-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-impl-framework-start-check-properties
     :spec org-apache-felix-systemready-impl-framework-start-check-properties-data}))
