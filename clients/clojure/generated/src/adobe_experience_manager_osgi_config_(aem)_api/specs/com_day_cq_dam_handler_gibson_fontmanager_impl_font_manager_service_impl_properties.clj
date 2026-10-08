(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-properties-data
  {
   (ds/opt :eventfilter) config-node-property-string-spec
   (ds/opt :fontmgrsystemfontdir) config-node-property-array-spec
   (ds/opt :fontmgradobefontdir) config-node-property-string-spec
   (ds/opt :fontmgrcustomerfontdir) config-node-property-string-spec
   })

(def com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-properties
     :spec com-day-cq-dam-handler-gibson-fontmanager-impl-font-manager-service-impl-properties-data}))
