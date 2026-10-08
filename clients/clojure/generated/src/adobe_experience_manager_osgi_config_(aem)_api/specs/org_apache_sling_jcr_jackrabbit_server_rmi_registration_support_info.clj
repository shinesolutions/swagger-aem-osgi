(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-properties-spec
   })

(def org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-info
     :spec org-apache-sling-jcr-jackrabbit-server-rmi-registration-support-info-data}))
