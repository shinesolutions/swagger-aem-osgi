(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties-data
  {
   (ds/opt :port) config-node-property-integer-spec
   })

(def org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties
     :spec org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties-data}))
