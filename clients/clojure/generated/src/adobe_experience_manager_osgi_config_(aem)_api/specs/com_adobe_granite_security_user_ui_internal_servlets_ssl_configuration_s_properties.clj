(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   })

(def com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties
     :spec com-adobe-granite-security-user-ui-internal-servlets-ssl-configuration-s-properties-data}))
