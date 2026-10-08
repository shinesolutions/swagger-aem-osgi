(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-startupfilter-impl-startup-filter-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-startupfilter-impl-startup-filter-impl-properties-data
  {
   (ds/opt :activebydefault) config-node-property-boolean-spec
   (ds/opt :defaultmessage) config-node-property-string-spec
   })

(def org-apache-sling-startupfilter-impl-startup-filter-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-startupfilter-impl-startup-filter-impl-properties
     :spec org-apache-sling-startupfilter-impl-startup-filter-impl-properties-data}))
