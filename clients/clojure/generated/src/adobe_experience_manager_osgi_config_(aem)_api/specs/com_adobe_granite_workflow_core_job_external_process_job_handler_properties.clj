(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-job-external-process-job-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-job-external-process-job-handler-properties-data
  {
   (ds/opt :defaulttimeout) config-node-property-integer-spec
   (ds/opt :maxtimeout) config-node-property-integer-spec
   (ds/opt :defaultperiod) config-node-property-integer-spec
   })

(def com-adobe-granite-workflow-core-job-external-process-job-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-job-external-process-job-handler-properties
     :spec com-adobe-granite-workflow-core-job-external-process-job-handler-properties-data}))
