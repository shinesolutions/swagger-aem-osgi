(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-properties-spec
   })

(def org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-info-spec
  (ds/spec
    {:name ::org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-info
     :spec org-apache-sling-distribution-packaging-impl-exporter-agent-distributio-info-data}))
