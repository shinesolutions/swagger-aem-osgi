(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-jaas-configuration-spi-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-jaas-configuration-spi-properties-data
  {
   (ds/opt :jaasdefaultRealmName) config-node-property-string-spec
   (ds/opt :jaasconfigProviderName) config-node-property-string-spec
   (ds/opt :jaasglobalConfigPolicy) config-node-property-drop-down-spec
   })

(def org-apache-felix-jaas-configuration-spi-properties-spec
  (ds/spec
    {:name ::org-apache-felix-jaas-configuration-spi-properties
     :spec org-apache-felix-jaas-configuration-spi-properties-data}))
