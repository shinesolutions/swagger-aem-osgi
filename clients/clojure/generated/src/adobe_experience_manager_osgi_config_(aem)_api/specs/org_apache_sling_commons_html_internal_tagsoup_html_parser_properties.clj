(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-commons-html-internal-tagsoup-html-parser-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-commons-html-internal-tagsoup-html-parser-properties-data
  {
   (ds/opt :parserfeatures) config-node-property-array-spec
   })

(def org-apache-sling-commons-html-internal-tagsoup-html-parser-properties-spec
  (ds/spec
    {:name ::org-apache-sling-commons-html-internal-tagsoup-html-parser-properties
     :spec org-apache-sling-commons-html-internal-tagsoup-html-parser-properties-data}))
