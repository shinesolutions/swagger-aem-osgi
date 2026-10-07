(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-metadata-editor-select-component-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-metadata-editor-select-component-handler-properties-data
  {
   (ds/opt :granitedata) config-node-property-array-spec
   })

(def com-day-cq-dam-core-impl-metadata-editor-select-component-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-metadata-editor-select-component-handler-properties
     :spec com-day-cq-dam-core-impl-metadata-editor-select-component-handler-properties-data}))
