(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-default-job-manager-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-default-job-manager-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-jobs-default-job-manager-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-event-impl-jobs-default-job-manager-properties-spec
   })

(def org-apache-sling-event-impl-jobs-default-job-manager-info-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-jobs-default-job-manager-info
     :spec org-apache-sling-event-impl-jobs-default-job-manager-info-data}))
