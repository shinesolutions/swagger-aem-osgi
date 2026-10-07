(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :jobpurgethreshold) config-node-property-integer-spec
   (ds/opt :jobpurgemaxjobs) config-node-property-integer-spec
   })

(def com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-properties
     :spec com-adobe-cq-wcm-jobs-async-impl-async-job-clean-up-task-properties-data}))
