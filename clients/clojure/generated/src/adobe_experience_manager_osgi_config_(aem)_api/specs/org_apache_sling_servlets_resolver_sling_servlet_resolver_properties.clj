(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-resolver-sling-servlet-resolver-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-resolver-sling-servlet-resolver-properties-data
  {
   (ds/opt :servletresolverservletRoot) config-node-property-string-spec
   (ds/opt :servletresolvercacheSize) config-node-property-integer-spec
   (ds/opt :servletresolverpaths) config-node-property-array-spec
   (ds/opt :servletresolverdefaultExtensions) config-node-property-array-spec
   })

(def org-apache-sling-servlets-resolver-sling-servlet-resolver-properties-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-resolver-sling-servlet-resolver-properties
     :spec org-apache-sling-servlets-resolver-sling-servlet-resolver-properties-data}))
