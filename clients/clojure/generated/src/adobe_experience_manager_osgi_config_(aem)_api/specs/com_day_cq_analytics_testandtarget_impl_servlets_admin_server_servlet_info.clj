(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-properties-spec
   })

(def com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-info
     :spec com-day-cq-analytics-testandtarget-impl-servlets-admin-server-servlet-info-data}))
