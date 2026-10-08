(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-properties-data
  {
   (ds/opt :servletPath) config-node-property-string-spec
   (ds/opt :disabled) config-node-property-boolean-spec
   (ds/opt :corsaccessControlAllowOrigin) config-node-property-string-spec
   })

(def org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-properties
     :spec org-apache-sling-hc-core-impl-servlet-health-check-executor-servlet-properties-data}))
