(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-properties-data
  {
   (ds/opt :slingservletpaths) config-node-property-string-spec
   (ds/opt :slingservletmethods) config-node-property-string-spec
   })

(def com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-properties
     :spec com-day-cq-dam-s7dam-common-servlets-s7dam-product-info-servlet-properties-data}))
