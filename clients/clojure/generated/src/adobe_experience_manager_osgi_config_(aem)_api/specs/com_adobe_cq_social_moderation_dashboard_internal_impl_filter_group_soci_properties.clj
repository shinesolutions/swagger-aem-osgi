(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-properties-data
  {
   (ds/opt :resourceTypefilters) config-node-property-array-spec
   (ds/opt :priority) config-node-property-integer-spec
   })

(def com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-properties
     :spec com-adobe-cq-social-moderation-dashboard-internal-impl-filter-group-soci-properties-data}))
