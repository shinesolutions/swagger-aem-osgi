(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-auth-core-impl-logout-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-auth-core-impl-logout-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-auth-core-impl-logout-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-auth-core-impl-logout-servlet-properties-spec
   })

(def org-apache-sling-auth-core-impl-logout-servlet-info-spec
  (ds/spec
    {:name ::org-apache-sling-auth-core-impl-logout-servlet-info
     :spec org-apache-sling-auth-core-impl-logout-servlet-info-data}))
