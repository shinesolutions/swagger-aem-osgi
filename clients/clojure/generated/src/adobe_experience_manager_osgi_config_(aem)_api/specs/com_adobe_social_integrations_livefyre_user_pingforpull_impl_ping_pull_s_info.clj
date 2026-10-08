(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties-spec
   })

(def com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-info-spec
  (ds/spec
    {:name ::com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-info
     :spec com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-info-data}))
