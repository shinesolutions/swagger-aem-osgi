(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-get-impl-version-version-info-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-get-impl-version-version-info-servlet-properties-data
  {
   (ds/opt :slingservletselectors) config-node-property-array-spec
   (ds/opt :ecmaSuport) config-node-property-boolean-spec
   })

(def org-apache-sling-servlets-get-impl-version-version-info-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-get-impl-version-version-info-servlet-properties
     :spec org-apache-sling-servlets-get-impl-version-version-info-servlet-properties-data}))
