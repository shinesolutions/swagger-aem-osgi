(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-properties-spec
   })

(def org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-info-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-info
     :spec org-apache-sling-distribution-trigger-impl-remote-event-distribution-trig-info-data}))
