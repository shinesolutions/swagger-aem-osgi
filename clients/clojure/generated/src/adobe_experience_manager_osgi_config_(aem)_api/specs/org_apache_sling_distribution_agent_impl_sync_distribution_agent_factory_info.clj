(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-properties-spec
   })

(def org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-info-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-info
     :spec org-apache-sling-distribution-agent-impl-sync-distribution-agent-factory-info-data}))
