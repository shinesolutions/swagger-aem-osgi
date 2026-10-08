(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties-data
  {
   (ds/opt :reportfetchattempts) config-node-property-integer-spec
   (ds/opt :reportfetchdelay) config-node-property-integer-spec
   })

(def com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties
     :spec com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties-data}))
