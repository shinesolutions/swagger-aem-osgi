(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-impl-services-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-impl-services-check-properties-data
  {
   (ds/opt :serviceslist) config-node-property-array-spec
   (ds/opt :type) config-node-property-drop-down-spec
   })

(def org-apache-felix-systemready-impl-services-check-properties-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-impl-services-check-properties
     :spec org-apache-felix-systemready-impl-services-check-properties-data}))
