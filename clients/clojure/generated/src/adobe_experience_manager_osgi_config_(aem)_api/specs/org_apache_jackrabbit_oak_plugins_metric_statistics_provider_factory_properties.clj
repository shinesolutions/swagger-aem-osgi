(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties-data
  {
   (ds/opt :providerType) config-node-property-drop-down-spec
   })

(def org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties
     :spec org-apache-jackrabbit-oak-plugins-metric-statistics-provider-factory-properties-data}))
