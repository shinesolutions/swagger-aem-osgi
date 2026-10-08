(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties-data
  {
   (ds/opt :testandtargetendpointurl) config-node-property-string-spec
   })

(def com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties
     :spec com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties-data}))
