(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-translation-impl-translation-service-config-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-translation-impl-translation-service-config-manager-properties-data
  {
   (ds/opt :translatelanguage) config-node-property-drop-down-spec
   (ds/opt :translatedisplay) config-node-property-drop-down-spec
   (ds/opt :translateattribution) config-node-property-boolean-spec
   (ds/opt :translatecaching) config-node-property-drop-down-spec
   (ds/opt :translatesmartrendering) config-node-property-drop-down-spec
   (ds/opt :translatecachingduration) config-node-property-string-spec
   (ds/opt :translatesessionsaveinterval) config-node-property-string-spec
   (ds/opt :translatesessionsavebatchLimit) config-node-property-string-spec
   })

(def com-adobe-cq-social-translation-impl-translation-service-config-manager-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-translation-impl-translation-service-config-manager-properties
     :spec com-adobe-cq-social-translation-impl-translation-service-config-manager-properties-data}))
