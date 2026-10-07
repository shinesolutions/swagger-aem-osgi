(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-http-sslfilter-ssl-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-http-sslfilter-ssl-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-http-sslfilter-ssl-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-http-sslfilter-ssl-filter-properties-spec
   })

(def org-apache-felix-http-sslfilter-ssl-filter-info-spec
  (ds/spec
    {:name ::org-apache-felix-http-sslfilter-ssl-filter-info
     :spec org-apache-felix-http-sslfilter-ssl-filter-info-data}))
