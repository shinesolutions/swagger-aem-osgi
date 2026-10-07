(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-base-internal-login-admin-whitelist-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-base-internal-login-admin-whitelist-properties-data
  {
   (ds/opt :whitelistbypass) config-node-property-boolean-spec
   (ds/opt :whitelistbundlesregexp) config-node-property-string-spec
   })

(def org-apache-sling-jcr-base-internal-login-admin-whitelist-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-base-internal-login-admin-whitelist-properties
     :spec org-apache-sling-jcr-base-internal-login-admin-whitelist-properties-data}))
