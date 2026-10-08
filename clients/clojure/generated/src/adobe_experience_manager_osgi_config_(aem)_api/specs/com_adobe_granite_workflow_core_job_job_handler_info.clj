(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-job-job-handler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-job-job-handler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-job-job-handler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-workflow-core-job-job-handler-properties-spec
   })

(def com-adobe-granite-workflow-core-job-job-handler-info-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-job-job-handler-info
     :spec com-adobe-granite-workflow-core-job-job-handler-info-data}))
