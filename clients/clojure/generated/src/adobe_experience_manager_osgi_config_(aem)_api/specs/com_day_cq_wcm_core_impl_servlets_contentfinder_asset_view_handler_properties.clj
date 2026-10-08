(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-properties-data
  {
   (ds/opt :damshowexpired) config-node-property-boolean-spec
   (ds/opt :damshowhidden) config-node-property-boolean-spec
   (ds/opt :tagTitleSearch) config-node-property-boolean-spec
   (ds/opt :guessTotal) config-node-property-string-spec
   (ds/opt :damexpiryProperty) config-node-property-string-spec
   })

(def com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-properties
     :spec com-day-cq-wcm-core-impl-servlets-contentfinder-asset-view-handler-properties-data}))
