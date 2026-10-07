(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties-spec
   })

(def org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-info-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-info
     :spec org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-info-data}))
