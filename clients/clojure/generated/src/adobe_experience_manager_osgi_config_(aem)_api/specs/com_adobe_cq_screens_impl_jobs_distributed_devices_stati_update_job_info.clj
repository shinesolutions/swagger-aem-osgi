(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-properties-spec
   })

(def com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-info-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-info
     :spec com-adobe-cq-screens-impl-jobs-distributed-devices-stati-update-job-info-data}))
