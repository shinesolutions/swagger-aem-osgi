(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-properties-data
  {
   (ds/opt :includepaths) config-node-property-array-spec
   (ds/opt :exporteruser) config-node-property-string-spec
   })

(def com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-properties
     :spec com-adobe-cq-scheduled-exporter-impl-scheduled-exporter-impl-properties-data}))
