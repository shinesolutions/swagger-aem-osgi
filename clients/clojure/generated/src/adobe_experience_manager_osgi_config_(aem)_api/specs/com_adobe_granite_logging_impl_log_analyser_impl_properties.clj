(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-logging-impl-log-analyser-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-logging-impl-log-analyser-impl-properties-data
  {
   (ds/opt :messagesqueuesize) config-node-property-integer-spec
   (ds/opt :loggerconfig) config-node-property-array-spec
   (ds/opt :messagessize) config-node-property-integer-spec
   })

(def com-adobe-granite-logging-impl-log-analyser-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-logging-impl-log-analyser-impl-properties
     :spec com-adobe-granite-logging-impl-log-analyser-impl-properties-data}))
