(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-commons-servlets-root-mapping-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-commons-servlets-root-mapping-servlet-properties-data
  {
   (ds/opt :rootmappingtarget) config-node-property-string-spec
   })

(def com-day-cq-commons-servlets-root-mapping-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-commons-servlets-root-mapping-servlet-properties
     :spec com-day-cq-commons-servlets-root-mapping-servlet-properties-data}))
