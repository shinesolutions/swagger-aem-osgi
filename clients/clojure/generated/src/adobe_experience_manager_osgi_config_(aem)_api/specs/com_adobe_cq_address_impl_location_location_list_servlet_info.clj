(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-address-impl-location-location-list-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-address-impl-location-location-list-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-address-impl-location-location-list-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-address-impl-location-location-list-servlet-properties-spec
   })

(def com-adobe-cq-address-impl-location-location-list-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-cq-address-impl-location-location-list-servlet-info
     :spec com-adobe-cq-address-impl-location-location-list-servlet-info-data}))
