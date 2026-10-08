(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-properties-spec
   })

(def com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-info-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-info
     :spec com-adobe-granite-workflow-core-jcr-workflow-bucket-manager-info-data}))
