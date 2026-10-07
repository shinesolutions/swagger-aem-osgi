(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-security-impl-content-disposition-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-security-impl-content-disposition-filter-properties-data
  {
   (ds/opt :slingcontentdispositionpaths) config-node-property-array-spec
   (ds/opt :slingcontentdispositionexcludedpaths) config-node-property-array-spec
   (ds/opt :slingcontentdispositionallpaths) config-node-property-boolean-spec
   })

(def org-apache-sling-security-impl-content-disposition-filter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-security-impl-content-disposition-filter-properties
     :spec org-apache-sling-security-impl-content-disposition-filter-properties-data}))
