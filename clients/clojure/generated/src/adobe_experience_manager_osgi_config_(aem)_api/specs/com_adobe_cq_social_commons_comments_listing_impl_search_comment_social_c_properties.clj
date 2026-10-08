(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-properties-data
  {
   (ds/opt :numUserLimit) config-node-property-integer-spec
   })

(def com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-properties
     :spec com-adobe-cq-social-commons-comments-listing-impl-search-comment-social-c-properties-data}))
