(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-statistics-impl-statistics-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-statistics-impl-statistics-service-impl-properties-data
  {
   (ds/opt :schedulerperiod) config-node-property-integer-spec
   (ds/opt :schedulerconcurrent) config-node-property-boolean-spec
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :workspace) config-node-property-string-spec
   (ds/opt :keywordsPath) config-node-property-string-spec
   (ds/opt :asyncEntries) config-node-property-boolean-spec
   })

(def com-day-cq-statistics-impl-statistics-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-statistics-impl-statistics-service-impl-properties
     :spec com-day-cq-statistics-impl-statistics-service-impl-properties-data}))
