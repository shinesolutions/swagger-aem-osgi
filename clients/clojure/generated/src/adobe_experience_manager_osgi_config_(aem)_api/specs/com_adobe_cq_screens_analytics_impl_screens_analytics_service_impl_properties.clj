(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-properties-data
  {
   (ds/opt :comadobecqscreensanalyticsimplurl) config-node-property-string-spec
   (ds/opt :comadobecqscreensanalyticsimplapikey) config-node-property-string-spec
   (ds/opt :comadobecqscreensanalyticsimplproject) config-node-property-string-spec
   (ds/opt :comadobecqscreensanalyticsimplenvironment) config-node-property-drop-down-spec
   (ds/opt :comadobecqscreensanalyticsimplsendFrequency) config-node-property-integer-spec
   })

(def com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-properties
     :spec com-adobe-cq-screens-analytics-impl-screens-analytics-service-impl-properties-data}))
