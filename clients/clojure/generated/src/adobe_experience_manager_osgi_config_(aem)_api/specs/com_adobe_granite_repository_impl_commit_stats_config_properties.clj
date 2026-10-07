(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-impl-commit-stats-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-impl-commit-stats-config-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :intervalSeconds) config-node-property-integer-spec
   (ds/opt :commitsPerIntervalThreshold) config-node-property-integer-spec
   (ds/opt :maxLocationLength) config-node-property-integer-spec
   (ds/opt :maxDetailsShown) config-node-property-integer-spec
   (ds/opt :minDetailsPercentage) config-node-property-integer-spec
   (ds/opt :threadMatchers) config-node-property-array-spec
   (ds/opt :maxGreedyDepth) config-node-property-integer-spec
   (ds/opt :greedyStackMatchers) config-node-property-string-spec
   (ds/opt :stackFilters) config-node-property-array-spec
   (ds/opt :stackMatchers) config-node-property-array-spec
   (ds/opt :stackCategorizers) config-node-property-array-spec
   (ds/opt :stackShorteners) config-node-property-array-spec
   })

(def com-adobe-granite-repository-impl-commit-stats-config-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-impl-commit-stats-config-properties
     :spec com-adobe-granite-repository-impl-commit-stats-config-properties-data}))
