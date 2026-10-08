(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-searchpromote-impl-search-promote-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-searchpromote-impl-search-promote-service-impl-properties-data
  {
   (ds/opt :cqsearchpromoteconfigurationserveruri) config-node-property-string-spec
   (ds/opt :cqsearchpromoteconfigurationenvironment) config-node-property-string-spec
   (ds/opt :connectiontimeout) config-node-property-integer-spec
   (ds/opt :sockettimeout) config-node-property-integer-spec
   })

(def com-day-cq-searchpromote-impl-search-promote-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-searchpromote-impl-search-promote-service-impl-properties
     :spec com-day-cq-searchpromote-impl-search-promote-service-impl-properties-data}))
