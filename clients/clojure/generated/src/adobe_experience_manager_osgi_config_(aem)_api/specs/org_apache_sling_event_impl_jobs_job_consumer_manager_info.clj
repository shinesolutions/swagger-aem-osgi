(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-job-consumer-manager-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-impl-jobs-job-consumer-manager-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-impl-jobs-job-consumer-manager-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-event-impl-jobs-job-consumer-manager-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-sling-event-impl-jobs-job-consumer-manager-info-spec
  (ds/spec
    {:name ::org-apache-sling-event-impl-jobs-job-consumer-manager-info
     :spec org-apache-sling-event-impl-jobs-job-consumer-manager-info-data}))
