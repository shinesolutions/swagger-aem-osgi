(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-systemready-system-ready-monitor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-systemready-system-ready-monitor-properties-data
  {
   (ds/opt :pollinterval) config-node-property-integer-spec
   })

(def org-apache-felix-systemready-system-ready-monitor-properties-spec
  (ds/spec
    {:name ::org-apache-felix-systemready-system-ready-monitor-properties
     :spec org-apache-felix-systemready-system-ready-monitor-properties-data}))
