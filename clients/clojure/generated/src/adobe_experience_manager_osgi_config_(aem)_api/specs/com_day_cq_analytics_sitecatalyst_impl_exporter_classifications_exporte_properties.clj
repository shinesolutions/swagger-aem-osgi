(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-properties-data
  {
   (ds/opt :allowedpaths) config-node-property-array-spec
   (ds/opt :cqanalyticssaintexporterpagesize) config-node-property-integer-spec
   })

(def com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-properties
     :spec com-day-cq-analytics-sitecatalyst-impl-exporter-classifications-exporte-properties-data}))
