(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-impl-servlet-system-ready-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-impl-servlet-system-ready-servlet-properties-data
  {
   (ds/opt :osgihttpwhiteboardservletpattern) config-node-property-string-spec
   (ds/opt :osgihttpwhiteboardcontextselect) config-node-property-string-spec
   })

(def org-apache-felix-systemready-impl-servlet-system-ready-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-impl-servlet-system-ready-servlet-properties
     :spec org-apache-felix-systemready-impl-servlet-system-ready-servlet-properties-data}))
