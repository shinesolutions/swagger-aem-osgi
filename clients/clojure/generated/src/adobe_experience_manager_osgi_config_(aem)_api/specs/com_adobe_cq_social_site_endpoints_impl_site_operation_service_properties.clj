(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties-data
  {
   (ds/opt :fieldWhitelist) config-node-property-array-spec
   (ds/opt :sitePathFilters) config-node-property-array-spec
   (ds/opt :sitePackageGroup) config-node-property-string-spec
   })

(def com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties
     :spec com-adobe-cq-social-site-endpoints-impl-site-operation-service-properties-data}))
