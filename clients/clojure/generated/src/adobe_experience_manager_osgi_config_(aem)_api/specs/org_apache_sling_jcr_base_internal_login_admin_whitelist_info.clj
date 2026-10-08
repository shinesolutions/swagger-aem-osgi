(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-base-internal-login-admin-whitelist-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-base-internal-login-admin-whitelist-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-base-internal-login-admin-whitelist-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-base-internal-login-admin-whitelist-properties-spec
   })

(def org-apache-sling-jcr-base-internal-login-admin-whitelist-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-base-internal-login-admin-whitelist-info
     :spec org-apache-sling-jcr-base-internal-login-admin-whitelist-info-data}))
