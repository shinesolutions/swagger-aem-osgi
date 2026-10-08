(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties-data
  {
   (ds/opt :allowonlysystemuser) config-node-property-boolean-spec
   })

(def org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties-spec
  (ds/spec
    {:name ::org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties
     :spec org-apache-sling-jcr-resource-internal-jcr-system-user-validator-properties-data}))
