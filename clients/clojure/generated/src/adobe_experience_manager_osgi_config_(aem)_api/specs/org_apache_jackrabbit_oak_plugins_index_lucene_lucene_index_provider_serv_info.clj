(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-info-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-info
     :spec org-apache-jackrabbit-oak-plugins-index-lucene-lucene-index-provider-serv-info-data}))
