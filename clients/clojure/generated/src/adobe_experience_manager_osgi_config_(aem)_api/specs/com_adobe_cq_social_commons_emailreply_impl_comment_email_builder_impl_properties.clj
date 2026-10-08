(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-properties-data
  {
   (ds/opt :contextpath) config-node-property-string-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-comment-email-builder-impl-properties-data}))
