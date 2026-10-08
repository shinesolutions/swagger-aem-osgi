(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties-data
  {
   (ds/opt :cqanalyticssitecatalystservicedatacenterurl) config-node-property-array-spec
   (ds/opt :devhostnamepatterns) config-node-property-array-spec
   (ds/opt :connectiontimeout) config-node-property-integer-spec
   (ds/opt :sockettimeout) config-node-property-integer-spec
   })

(def com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties
     :spec com-day-cq-analytics-sitecatalyst-impl-sitecatalyst-http-client-impl-properties-data}))
