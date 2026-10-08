(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-i18n-impl-i18-n-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-i18n-impl-i18-n-filter-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :slingfilterscope) config-node-property-array-spec
   })

(def org-apache-sling-i18n-impl-i18-n-filter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-i18n-impl-i18-n-filter-properties
     :spec org-apache-sling-i18n-impl-i18-n-filter-properties-data}))
