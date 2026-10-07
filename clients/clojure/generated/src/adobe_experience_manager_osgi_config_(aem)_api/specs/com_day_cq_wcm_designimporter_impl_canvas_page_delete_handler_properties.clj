(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-properties-data
  {
   (ds/opt :minThreadPoolSize) config-node-property-integer-spec
   (ds/opt :maxThreadPoolSize) config-node-property-integer-spec
   })

(def com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-properties
     :spec com-day-cq-wcm-designimporter-impl-canvas-page-delete-handler-properties-data}))
