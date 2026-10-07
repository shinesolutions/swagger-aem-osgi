(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-properties-spec
   })

(def com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-info-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-info
     :spec com-adobe-cq-dam-cfm-impl-content-rewriter-payload-filter-info-data}))
