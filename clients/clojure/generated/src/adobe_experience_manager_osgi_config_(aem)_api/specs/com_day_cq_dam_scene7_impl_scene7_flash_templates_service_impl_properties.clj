(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-properties-data
  {
   (ds/opt :scene7FlashTemplatesrti) config-node-property-string-spec
   (ds/opt :scene7FlashTemplatesrsi) config-node-property-string-spec
   (ds/opt :scene7FlashTemplatesrb) config-node-property-string-spec
   (ds/opt :scene7FlashTemplatesrurl) config-node-property-string-spec
   (ds/opt :scene7FlashTemplateurlFormatParameter) config-node-property-string-spec
   })

(def com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-properties
     :spec com-day-cq-dam-scene7-impl-scene7-flash-templates-service-impl-properties-data}))
