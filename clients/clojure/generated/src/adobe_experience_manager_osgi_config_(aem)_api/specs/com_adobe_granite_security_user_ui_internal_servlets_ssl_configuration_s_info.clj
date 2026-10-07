(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties-spec
   })

(def com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-info-spec
  (ds/spec
    {:name ::com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-info
     :spec com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-info-data}))
