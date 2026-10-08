(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties-data
  {
   (ds/opt :guessTotal) config-node-property-string-spec
   (ds/opt :tagTitleSearch) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties
     :spec com-day-cq-wcm-core-impl-servlets-contentfinder-page-view-handler-properties-data}))
