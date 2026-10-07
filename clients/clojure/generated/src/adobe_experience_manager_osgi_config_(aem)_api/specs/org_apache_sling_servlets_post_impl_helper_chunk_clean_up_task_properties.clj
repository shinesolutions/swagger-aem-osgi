(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :schedulerconcurrent) config-node-property-boolean-spec
   (ds/opt :chunkcleanupage) config-node-property-integer-spec
   })

(def org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties
     :spec org-apache-sling-servlets-post-impl-helper-chunk-clean-up-task-properties-data}))
