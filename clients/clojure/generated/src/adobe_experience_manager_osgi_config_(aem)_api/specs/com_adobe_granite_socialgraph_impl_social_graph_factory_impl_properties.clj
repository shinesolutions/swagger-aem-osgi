(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-socialgraph-impl-social-graph-factory-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-socialgraph-impl-social-graph-factory-impl-properties-data
  {
   (ds/opt :group2memberrelationshipoutgoing) config-node-property-string-spec
   (ds/opt :group2memberexcludedoutgoing) config-node-property-array-spec
   (ds/opt :group2memberrelationshipincoming) config-node-property-string-spec
   (ds/opt :group2memberexcludedincoming) config-node-property-array-spec
   })

(def com-adobe-granite-socialgraph-impl-social-graph-factory-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-socialgraph-impl-social-graph-factory-impl-properties
     :spec com-adobe-granite-socialgraph-impl-social-graph-factory-impl-properties-data}))
