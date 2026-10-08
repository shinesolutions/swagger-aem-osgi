(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-info
     :spec org-apache-jackrabbit-oak-security-user-random-authorizable-node-name-info-data}))
