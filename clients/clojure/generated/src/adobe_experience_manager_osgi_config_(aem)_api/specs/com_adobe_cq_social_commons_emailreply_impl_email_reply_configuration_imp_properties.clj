(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties-data
  {
   (ds/opt :emailname) config-node-property-string-spec
   (ds/opt :emailcreatePostFromReply) config-node-property-boolean-spec
   (ds/opt :emailaddCommentIdTo) config-node-property-drop-down-spec
   (ds/opt :emailsubjectMaximumLength) config-node-property-integer-spec
   (ds/opt :emailreplyToAddress) config-node-property-string-spec
   (ds/opt :emailreplyToDelimiter) config-node-property-string-spec
   (ds/opt :emailtrackerIdPrefixInSubject) config-node-property-string-spec
   (ds/opt :emailtrackerIdPrefixInBody) config-node-property-string-spec
   (ds/opt :emailasHTML) config-node-property-boolean-spec
   (ds/opt :emaildefaultUserName) config-node-property-string-spec
   (ds/opt :emailtemplatesrootPath) config-node-property-string-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-email-reply-configuration-imp-properties-data}))
