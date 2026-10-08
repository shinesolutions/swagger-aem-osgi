(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-i18n-impl-jcr-resource-bundle-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-i18n-impl-jcr-resource-bundle-provider-properties-data
  {
   (ds/opt :localedefault) config-node-property-string-spec
   (ds/opt :preloadbundles) config-node-property-boolean-spec
   (ds/opt :invalidationdelay) config-node-property-integer-spec
   })

(def org-apache-sling-i18n-impl-jcr-resource-bundle-provider-properties-spec
  (ds/spec
    {:name ::org-apache-sling-i18n-impl-jcr-resource-bundle-provider-properties
     :spec org-apache-sling-i18n-impl-jcr-resource-bundle-provider-properties-data}))
