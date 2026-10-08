(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-log-request-logger-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-log-request-logger-service-properties-data
  {
   (ds/opt :requestlogserviceformat) config-node-property-string-spec
   (ds/opt :requestlogserviceoutput) config-node-property-string-spec
   (ds/opt :requestlogserviceoutputtype) config-node-property-drop-down-spec
   (ds/opt :requestlogserviceonentry) config-node-property-boolean-spec
   })

(def org-apache-sling-engine-impl-log-request-logger-service-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-log-request-logger-service-properties
     :spec org-apache-sling-engine-impl-log-request-logger-service-properties-data}))
