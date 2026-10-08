(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-polling-importer-impl-polling-importer-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-polling-importer-impl-polling-importer-impl-properties-data
  {
   (ds/opt :importermininterval) config-node-property-integer-spec
   (ds/opt :importeruser) config-node-property-string-spec
   (ds/opt :excludepaths) config-node-property-array-spec
   (ds/opt :includepaths) config-node-property-array-spec
   })

(def com-day-cq-polling-importer-impl-polling-importer-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-polling-importer-impl-polling-importer-impl-properties
     :spec com-day-cq-polling-importer-impl-polling-importer-impl-properties-data}))
