(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-html-internal-tagsoup-html-parser-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-html-internal-tagsoup-html-parser-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-html-internal-tagsoup-html-parser-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-sling-commons-html-internal-tagsoup-html-parser-properties-spec
   })

(def org-apache-sling-commons-html-internal-tagsoup-html-parser-info-spec
  (ds/spec
    {:name ::org-apache-sling-commons-html-internal-tagsoup-html-parser-info
     :spec org-apache-sling-commons-html-internal-tagsoup-html-parser-info-data}))
