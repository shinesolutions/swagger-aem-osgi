(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-default-logins-health-check-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-hc-impl-default-logins-health-check-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :accountlogins) config-node-property-array-spec
   (ds/opt :consolelogins) config-node-property-array-spec
   })

(def com-adobe-granite-repository-hc-impl-default-logins-health-check-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-hc-impl-default-logins-health-check-properties
     :spec com-adobe-granite-repository-hc-impl-default-logins-health-check-properties-data}))
