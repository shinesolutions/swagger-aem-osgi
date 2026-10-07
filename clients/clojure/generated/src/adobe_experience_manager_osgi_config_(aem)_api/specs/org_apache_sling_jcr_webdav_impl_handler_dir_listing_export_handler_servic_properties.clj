(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties
     :spec org-apache-sling-jcr-webdav-impl-handler-dir-listing-export-handler-servic-properties-data}))
