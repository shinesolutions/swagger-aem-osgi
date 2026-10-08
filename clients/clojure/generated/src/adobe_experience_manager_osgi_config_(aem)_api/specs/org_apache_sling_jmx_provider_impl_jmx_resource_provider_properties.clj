(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jmx-provider-impl-jmx-resource-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jmx-provider-impl-jmx-resource-provider-properties-data
  {
   (ds/opt :providerroots) config-node-property-string-spec
   })

(def org-apache-sling-jmx-provider-impl-jmx-resource-provider-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jmx-provider-impl-jmx-resource-provider-properties
     :spec org-apache-sling-jmx-provider-impl-jmx-resource-provider-properties-data}))
