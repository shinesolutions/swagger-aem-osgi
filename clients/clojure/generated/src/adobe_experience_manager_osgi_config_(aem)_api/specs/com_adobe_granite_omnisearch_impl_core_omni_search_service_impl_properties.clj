(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-properties-data
  {
   (ds/opt :omnisearchsuggestionrequiretextmin) config-node-property-integer-spec
   (ds/opt :omnisearchsuggestionspellcheckrequire) config-node-property-boolean-spec
   })

(def com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-properties
     :spec com-adobe-granite-omnisearch-impl-core-omni-search-service-impl-properties-data}))
