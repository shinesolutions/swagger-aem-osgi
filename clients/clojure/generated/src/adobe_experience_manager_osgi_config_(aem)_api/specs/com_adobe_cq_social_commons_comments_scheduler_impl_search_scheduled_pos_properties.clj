(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-properties-data
  {
   (ds/opt :enableScheduledPostsSearch) config-node-property-boolean-spec
   (ds/opt :numberOfMinutes) config-node-property-integer-spec
   (ds/opt :maxSearchLimit) config-node-property-integer-spec
   })

(def com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-properties
     :spec com-adobe-cq-social-commons-comments-scheduler-impl-search-scheduled-pos-properties-data}))
