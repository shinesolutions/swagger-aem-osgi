(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-address-impl-location-location-list-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-address-impl-location-location-list-servlet-properties-data
  {
   (ds/opt :cqaddresslocationdefaultmaxResults) config-node-property-integer-spec
   })

(def com-adobe-cq-address-impl-location-location-list-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-address-impl-location-location-list-servlet-properties
     :spec com-adobe-cq-address-impl-location-location-list-servlet-properties-data}))
