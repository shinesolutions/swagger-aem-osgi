(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-properties-spec
   })

(def com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-info-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-info
     :spec com-day-cq-analytics-sitecatalyst-impl-importer-report-importer-info-data}))
