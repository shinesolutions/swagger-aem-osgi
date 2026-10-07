(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties-data
  {
   (ds/opt :schedulerperiod) config-node-property-integer-spec
   (ds/opt :schedulerconcurrent) config-node-property-boolean-spec
   (ds/opt :good_link_test_interval) config-node-property-integer-spec
   (ds/opt :bad_link_test_interval) config-node-property-integer-spec
   (ds/opt :link_unused_interval) config-node-property-integer-spec
   (ds/opt :connectiontimeout) config-node-property-integer-spec
   })

(def com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties
     :spec com-day-cq-rewriter-linkchecker-impl-link-checker-task-properties-data}))
