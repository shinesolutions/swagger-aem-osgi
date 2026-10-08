(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-reports-report-purge-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-reports-report-purge-service-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :maxSavedReports) config-node-property-integer-spec
   (ds/opt :timeDuration) config-node-property-integer-spec
   (ds/opt :enableReportPurge) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-reports-report-purge-service-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-reports-report-purge-service-properties
     :spec com-day-cq-dam-core-impl-reports-report-purge-service-properties-data}))
