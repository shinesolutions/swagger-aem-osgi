(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-frags-impl-random-feature-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-frags-impl-random-feature-properties-data
  {
   (ds/opt :featurename) config-node-property-string-spec
   (ds/opt :featuredescription) config-node-property-string-spec
   (ds/opt :activepercentage) config-node-property-string-spec
   (ds/opt :cookiename) config-node-property-string-spec
   (ds/opt :cookiemaxAge) config-node-property-integer-spec
   })

(def com-adobe-granite-frags-impl-random-feature-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-frags-impl-random-feature-properties
     :spec com-adobe-granite-frags-impl-random-feature-properties-data}))
