(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-caconfig-impl-configuration-resolver-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-caconfig-impl-configuration-resolver-impl-properties-data
  {
   (ds/opt :configBucketNames) config-node-property-array-spec
   })

(def org-apache-sling-caconfig-impl-configuration-resolver-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-caconfig-impl-configuration-resolver-impl-properties
     :spec org-apache-sling-caconfig-impl-configuration-resolver-impl-properties-data}))
