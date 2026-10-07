(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-system-ready-monitor-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-system-ready-monitor-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-system-ready-monitor-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-systemready-system-ready-monitor-properties-spec
   })

(def org-apache-felix-systemready-system-ready-monitor-info-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-system-ready-monitor-info
     :spec org-apache-felix-systemready-system-ready-monitor-info-data}))
