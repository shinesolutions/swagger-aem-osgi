(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-featureflags-impl-configured-feature-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-featureflags-impl-configured-feature-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-featureflags-impl-configured-feature-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-featureflags-impl-configured-feature-properties-spec
   })

(def org-apache-sling-featureflags-impl-configured-feature-info-spec
  (ds/spec
    {:name ::org-apache-sling-featureflags-impl-configured-feature-info
     :spec org-apache-sling-featureflags-impl-configured-feature-info-data}))
