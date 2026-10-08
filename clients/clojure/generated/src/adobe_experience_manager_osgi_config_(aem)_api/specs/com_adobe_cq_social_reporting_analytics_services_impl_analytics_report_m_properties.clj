(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-properties-data
  {
   (ds/opt :reportfetchdelay) config-node-property-integer-spec
   })

(def com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-properties
     :spec com-adobe-cq-social-reporting-analytics-services-impl-analytics-report-m-properties-data}))
