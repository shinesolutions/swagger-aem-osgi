(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-auth-core-impl-logout-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-auth-core-impl-logout-servlet-properties-data
  {
   (ds/opt :slingservletmethods) config-node-property-array-spec
   (ds/opt :slingservletpaths) config-node-property-string-spec
   })

(def org-apache-sling-auth-core-impl-logout-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-auth-core-impl-logout-servlet-properties
     :spec org-apache-sling-auth-core-impl-logout-servlet-properties-data}))
