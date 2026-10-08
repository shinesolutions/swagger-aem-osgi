(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-searchpromote-impl-publish-search-promote-config-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-searchpromote-impl-publish-search-promote-config-handler-properties-data
  {
   (ds/opt :cqsearchpromoteconfighandlerenabled) config-node-property-boolean-spec
   })

(def com-day-cq-searchpromote-impl-publish-search-promote-config-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-searchpromote-impl-publish-search-promote-config-handler-properties
     :spec com-day-cq-searchpromote-impl-publish-search-promote-config-handler-properties-data}))
