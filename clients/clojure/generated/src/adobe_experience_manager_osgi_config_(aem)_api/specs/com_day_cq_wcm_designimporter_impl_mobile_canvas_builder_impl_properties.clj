(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-properties-data
  {
   (ds/opt :filepattern) config-node-property-string-spec
   (ds/opt :devicegroups) config-node-property-array-spec
   (ds/opt :buildpagenodes) config-node-property-boolean-spec
   (ds/opt :buildclientlibs) config-node-property-boolean-spec
   (ds/opt :buildcanvascomponent) config-node-property-boolean-spec
   })

(def com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-properties
     :spec com-day-cq-wcm-designimporter-impl-mobile-canvas-builder-impl-properties-data}))
