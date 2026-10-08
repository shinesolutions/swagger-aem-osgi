(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-properties-data
  {
   (ds/opt :name) config-node-property-string-spec
   (ds/opt :jcrPrivilege) config-node-property-string-spec
   })

(def org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-properties-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-properties
     :spec org-apache-sling-distribution-agent-impl-privilege-distribution-request-a-properties-data}))
