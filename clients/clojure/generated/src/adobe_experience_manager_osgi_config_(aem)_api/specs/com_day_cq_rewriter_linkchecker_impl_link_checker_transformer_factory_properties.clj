(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-properties-data
  {
   (ds/opt :linkcheckertransformerdisableRewriting) config-node-property-boolean-spec
   (ds/opt :linkcheckertransformerdisableChecking) config-node-property-boolean-spec
   (ds/opt :linkcheckertransformermapCacheSize) config-node-property-integer-spec
   (ds/opt :linkcheckertransformerstrictExtensionCheck) config-node-property-boolean-spec
   (ds/opt :linkcheckertransformerstripHtmltExtension) config-node-property-boolean-spec
   (ds/opt :linkcheckertransformerrewriteElements) config-node-property-array-spec
   (ds/opt :linkcheckertransformerstripExtensionPathBlacklist) config-node-property-array-spec
   })

(def com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-properties-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-properties
     :spec com-day-cq-rewriter-linkchecker-impl-link-checker-transformer-factory-properties-data}))
