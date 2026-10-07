(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties-data
  {
   (ds/opt :syncTranslationStateschedulingFormat) config-node-property-string-spec
   (ds/opt :schedulingRepeatTranslationschedulingFormat) config-node-property-string-spec
   (ds/opt :syncTranslationStatelockTimeoutInMinutes) config-node-property-string-spec
   (ds/opt :exportformat) config-node-property-drop-down-spec
   })

(def com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties
     :spec com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties-data}))
