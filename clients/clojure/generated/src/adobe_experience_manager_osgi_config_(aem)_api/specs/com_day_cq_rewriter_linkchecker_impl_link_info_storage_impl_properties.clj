(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-properties-data
  {
   (ds/opt :servicemax_links_per_host) config-node-property-integer-spec
   (ds/opt :servicesave_external_link_references) config-node-property-boolean-spec
   })

(def com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-properties
     :spec com-day-cq-rewriter-linkchecker-impl-link-info-storage-impl-properties-data}))
