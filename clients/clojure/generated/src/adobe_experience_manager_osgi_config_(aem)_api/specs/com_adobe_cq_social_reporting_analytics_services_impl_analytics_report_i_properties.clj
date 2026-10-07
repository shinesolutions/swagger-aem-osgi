(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-properties-data
  {
   (ds/opt :cqsocialreportinganalyticspollingimporterinterval) config-node-property-integer-spec
   (ds/opt :cqsocialreportinganalyticspollingimporterpageSize) config-node-property-integer-spec
   })

(def com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-properties
     :spec com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-i-properties-data}))
