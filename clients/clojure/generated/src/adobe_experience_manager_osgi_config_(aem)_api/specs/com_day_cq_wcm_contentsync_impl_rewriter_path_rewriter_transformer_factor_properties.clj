(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-properties-data
  {
   (ds/opt :cqcontentsyncpathrewritertransformermappinglinks) config-node-property-array-spec
   (ds/opt :cqcontentsyncpathrewritertransformermappingclientlibs) config-node-property-array-spec
   (ds/opt :cqcontentsyncpathrewritertransformermappingimages) config-node-property-array-spec
   (ds/opt :cqcontentsyncpathrewritertransformerattributepattern) config-node-property-string-spec
   (ds/opt :cqcontentsyncpathrewritertransformerclientlibrarypattern) config-node-property-string-spec
   (ds/opt :cqcontentsyncpathrewritertransformerclientlibraryreplace) config-node-property-string-spec
   })

(def com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-properties
     :spec com-day-cq-wcm-contentsync-impl-rewriter-path-rewriter-transformer-factor-properties-data}))
