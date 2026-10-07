(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-widget-impl-widget-extension-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-widget-impl-widget-extension-provider-impl-properties-data
  {
   (ds/opt :extendablewidgets) config-node-property-array-spec
   (ds/opt :widgetextensionproviderdebug) config-node-property-boolean-spec
   })

(def com-day-cq-widget-impl-widget-extension-provider-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-widget-impl-widget-extension-provider-impl-properties
     :spec com-day-cq-widget-impl-widget-extension-provider-impl-properties-data}))
