(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :tagpattern) config-node-property-string-spec
   })

(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-properties
     :spec com-day-cq-wcm-designimporter-parser-taghandlers-factory-non-script-tag-h-properties-data}))
