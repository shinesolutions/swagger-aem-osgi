(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-jobs-queue-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-event-jobs-queue-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-event-jobs-queue-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-event-jobs-queue-configuration-properties-spec
   })

(def org-apache-sling-event-jobs-queue-configuration-info-spec
  (ds/spec
    {:name ::org-apache-sling-event-jobs-queue-configuration-info
     :spec org-apache-sling-event-jobs-queue-configuration-info-data}))
