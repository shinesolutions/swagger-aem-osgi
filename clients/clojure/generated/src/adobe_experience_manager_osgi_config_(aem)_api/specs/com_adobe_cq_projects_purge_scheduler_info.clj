(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-projects-purge-scheduler-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-projects-purge-scheduler-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-projects-purge-scheduler-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-projects-purge-scheduler-properties-spec
   })

(def com-adobe-cq-projects-purge-scheduler-info-spec
  (ds/spec
    {:name ::com-adobe-cq-projects-purge-scheduler-info
     :spec com-adobe-cq-projects-purge-scheduler-info-data}))
