(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties-spec
   })

(def org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-info-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-info
     :spec org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-info-data}))
