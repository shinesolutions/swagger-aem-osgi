(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-repoinit-repository-initializer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-repoinit-repository-initializer-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-repoinit-repository-initializer-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-repoinit-repository-initializer-properties-spec
   })

(def org-apache-sling-jcr-repoinit-repository-initializer-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-repoinit-repository-initializer-info
     :spec org-apache-sling-jcr-repoinit-repository-initializer-info-data}))
