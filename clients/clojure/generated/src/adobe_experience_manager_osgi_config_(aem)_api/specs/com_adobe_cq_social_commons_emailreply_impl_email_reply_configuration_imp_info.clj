(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-info
     :spec com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-info-data}))
