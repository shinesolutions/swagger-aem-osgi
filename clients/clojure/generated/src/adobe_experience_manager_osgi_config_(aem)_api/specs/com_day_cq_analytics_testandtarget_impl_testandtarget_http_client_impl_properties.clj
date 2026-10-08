(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties-data
  {
   (ds/opt :cqanalyticstestandtargetapiurl) config-node-property-string-spec
   (ds/opt :cqanalyticstestandtargettimeout) config-node-property-integer-spec
   (ds/opt :cqanalyticstestandtargetsockettimeout) config-node-property-integer-spec
   (ds/opt :cqanalyticstestandtargetrecommendationsurlreplace) config-node-property-string-spec
   (ds/opt :cqanalyticstestandtargetrecommendationsurlreplacewith) config-node-property-string-spec
   })

(def com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties
     :spec com-day-cq-analytics-testandtarget-impl-testandtarget-http-client-impl-properties-data}))
