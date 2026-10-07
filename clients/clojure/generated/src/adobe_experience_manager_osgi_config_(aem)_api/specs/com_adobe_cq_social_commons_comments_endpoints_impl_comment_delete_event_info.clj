(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-properties-spec
   })

(def com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-info
     :spec com-adobe-cq-social-commons-comments-endpoints-impl-comment-delete-event-info-data}))
