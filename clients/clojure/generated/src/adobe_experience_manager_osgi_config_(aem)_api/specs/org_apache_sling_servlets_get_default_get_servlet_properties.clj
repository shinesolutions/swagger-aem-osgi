(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-get-default-get-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-get-default-get-servlet-properties-data
  {
   (ds/opt :aliases) config-node-property-array-spec
   (ds/opt :index) config-node-property-boolean-spec
   (ds/opt :indexfiles) config-node-property-array-spec
   (ds/opt :enablehtml) config-node-property-boolean-spec
   (ds/opt :enablejson) config-node-property-boolean-spec
   (ds/opt :enabletxt) config-node-property-boolean-spec
   (ds/opt :enablexml) config-node-property-boolean-spec
   (ds/opt :jsonmaximumresults) config-node-property-integer-spec
   (ds/opt :ecmaSuport) config-node-property-boolean-spec
   })

(def org-apache-sling-servlets-get-default-get-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-get-default-get-servlet-properties
     :spec org-apache-sling-servlets-get-default-get-servlet-properties-data}))
