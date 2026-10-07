(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-aries-jmx-framework-state-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-aries-jmx-framework-state-config-properties-data
  {
   (ds/opt :attributeChangeNotificationEnabled) config-node-property-boolean-spec
   })

(def org-apache-aries-jmx-framework-state-config-properties-spec
  (ds/spec
    {:name ::org-apache-aries-jmx-framework-state-config-properties
     :spec org-apache-aries-jmx-framework-state-config-properties-data}))
