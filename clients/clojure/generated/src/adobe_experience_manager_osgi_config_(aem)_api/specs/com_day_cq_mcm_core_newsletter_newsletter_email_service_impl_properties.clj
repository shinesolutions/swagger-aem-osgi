(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-properties-data
  {
   (ds/opt :fromaddress) config-node-property-string-spec
   (ds/opt :senderhost) config-node-property-string-spec
   (ds/opt :maxbouncecount) config-node-property-string-spec
   })

(def com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-properties
     :spec com-day-cq-mcm-core-newsletter-newsletter-email-service-impl-properties-data}))
