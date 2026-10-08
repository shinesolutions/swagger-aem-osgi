(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-campaign-impl-integration-config-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mcm-campaign-impl-integration-config-impl-properties-data
  {
   (ds/opt :aemmcmcampaignformConstraints) config-node-property-array-spec
   (ds/opt :aemmcmcampaignpublicUrl) config-node-property-string-spec
   (ds/opt :aemmcmcampaignrelaxedSSL) config-node-property-boolean-spec
   })

(def com-day-cq-mcm-campaign-impl-integration-config-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-mcm-campaign-impl-integration-config-impl-properties
     :spec com-day-cq-mcm-campaign-impl-integration-config-impl-properties-data}))
