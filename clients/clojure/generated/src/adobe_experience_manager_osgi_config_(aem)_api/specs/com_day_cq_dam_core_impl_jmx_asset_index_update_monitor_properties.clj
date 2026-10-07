(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-properties-data
  {
   (ds/opt :jmxobjectname) config-node-property-string-spec
   (ds/opt :propertymeasureenabled) config-node-property-boolean-spec
   (ds/opt :propertyname) config-node-property-string-spec
   (ds/opt :propertymaxwaitms) config-node-property-integer-spec
   (ds/opt :propertymaxrate) config-node-property-float-spec
   (ds/opt :fulltextmeasureenabled) config-node-property-boolean-spec
   (ds/opt :fulltextname) config-node-property-string-spec
   (ds/opt :fulltextmaxwaitms) config-node-property-integer-spec
   (ds/opt :fulltextmaxrate) config-node-property-float-spec
   })

(def com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-properties
     :spec com-day-cq-dam-core-impl-jmx-asset-index-update-monitor-properties-data}))
