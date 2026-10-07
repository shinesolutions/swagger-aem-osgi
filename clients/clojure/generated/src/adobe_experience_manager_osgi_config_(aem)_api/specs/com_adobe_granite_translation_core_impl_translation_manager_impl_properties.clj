(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-translation-core-impl-translation-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-translation-core-impl-translation-manager-impl-properties-data
  {
   (ds/opt :defaultConnectorName) config-node-property-string-spec
   (ds/opt :defaultCategory) config-node-property-string-spec
   })

(def com-adobe-granite-translation-core-impl-translation-manager-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-translation-core-impl-translation-manager-impl-properties
     :spec com-adobe-granite-translation-core-impl-translation-manager-impl-properties-data}))
