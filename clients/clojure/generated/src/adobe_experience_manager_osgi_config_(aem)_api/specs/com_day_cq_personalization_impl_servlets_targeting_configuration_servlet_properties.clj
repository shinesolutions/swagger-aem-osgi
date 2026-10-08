(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties-data
  {
   (ds/opt :forcelocation) config-node-property-boolean-spec
   })

(def com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties
     :spec com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties-data}))
