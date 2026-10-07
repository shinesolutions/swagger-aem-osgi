(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-calendar-servlets-time-zone-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-calendar-servlets-time-zone-servlet-properties-data
  {
   (ds/opt :timezonesexpirytime) config-node-property-integer-spec
   })

(def com-adobe-cq-social-calendar-servlets-time-zone-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-calendar-servlets-time-zone-servlet-properties
     :spec com-adobe-cq-social-calendar-servlets-time-zone-servlet-properties-data}))
