(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-properties-spec
   })

(def com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-info-spec
  (ds/spec
    {:name ::com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-info
     :spec com-adobe-cq-cdn-rewriter-impl-cdn-rewriter-info-data}))
