(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-properties-spec
   })

(def com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-info-spec
  (ds/spec
    {:name ::com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-info
     :spec com-day-cq-personalization-impl-servlets-targeting-configuration-servlet-info-data}))
