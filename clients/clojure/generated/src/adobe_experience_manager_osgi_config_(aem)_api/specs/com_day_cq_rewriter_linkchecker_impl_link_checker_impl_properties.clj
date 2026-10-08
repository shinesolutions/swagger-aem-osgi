(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties-data
  {
   (ds/opt :schedulerperiod) config-node-property-integer-spec
   (ds/opt :schedulerconcurrent) config-node-property-boolean-spec
   (ds/opt :servicebad_link_tolerance_interval) config-node-property-integer-spec
   (ds/opt :servicecheck_override_patterns) config-node-property-array-spec
   (ds/opt :servicecache_broken_internal_links) config-node-property-boolean-spec
   (ds/opt :servicespecial_link_prefix) config-node-property-array-spec
   (ds/opt :servicespecial_link_patterns) config-node-property-array-spec
   })

(def com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties
     :spec com-day-cq-rewriter-linkchecker-impl-link-checker-impl-properties-data}))
