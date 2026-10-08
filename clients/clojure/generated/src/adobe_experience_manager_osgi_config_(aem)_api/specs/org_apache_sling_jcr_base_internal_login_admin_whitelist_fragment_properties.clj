(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-properties-data
  {
   (ds/opt :whitelistname) config-node-property-string-spec
   (ds/opt :whitelistbundles) config-node-property-array-spec
   })

(def org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-properties
     :spec org-apache-sling-jcr-base-internal-login-admin-whitelist-fragment-properties-data}))
