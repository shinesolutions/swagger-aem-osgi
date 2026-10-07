(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-properties-data
  {
   (ds/opt :cqsocialconsoleanalyticscomponents) config-node-property-array-spec
   })

(def com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-properties
     :spec com-adobe-cq-social-site-impl-analytics-component-configuration-service-im-properties-data}))
