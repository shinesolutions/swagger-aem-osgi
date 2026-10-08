(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   })

(def com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties
     :spec com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties-data}))
