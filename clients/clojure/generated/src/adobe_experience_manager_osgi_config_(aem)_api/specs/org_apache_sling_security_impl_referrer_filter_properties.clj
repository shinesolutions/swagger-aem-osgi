(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-security-impl-referrer-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-security-impl-referrer-filter-properties-data
  {
   (ds/opt :allowempty) config-node-property-boolean-spec
   (ds/opt :allowhosts) config-node-property-array-spec
   (ds/opt :allowhostsregexp) config-node-property-array-spec
   (ds/opt :filtermethods) config-node-property-array-spec
   (ds/opt :excludeagentsregexp) config-node-property-array-spec
   })

(def org-apache-sling-security-impl-referrer-filter-properties-spec
  (ds/spec
    {:name ::org-apache-sling-security-impl-referrer-filter-properties
     :spec org-apache-sling-security-impl-referrer-filter-properties-data}))
