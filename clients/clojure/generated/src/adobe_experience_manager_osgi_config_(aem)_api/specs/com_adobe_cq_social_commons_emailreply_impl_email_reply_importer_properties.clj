(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-properties-data
  {
   (ds/opt :connectProtocol) config-node-property-drop-down-spec
   })

(def com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-properties
     :spec com-adobe-cq-social-commons-emailreply-impl-email-reply-importer-properties-data}))
