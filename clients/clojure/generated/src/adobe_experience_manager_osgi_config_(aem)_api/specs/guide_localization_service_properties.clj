(ns adobe-experience-manager-osgi-config-(aem)-api.specs.guide-localization-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def guide-localization-service-properties-data
  {
   (ds/opt :supportedLocales) config-node-property-array-spec
   (ds/opt :LocalizableProperties) config-node-property-array-spec
   })

(def guide-localization-service-properties-spec
  (ds/spec
    {:name ::guide-localization-service-properties
     :spec guide-localization-service-properties-data}))
