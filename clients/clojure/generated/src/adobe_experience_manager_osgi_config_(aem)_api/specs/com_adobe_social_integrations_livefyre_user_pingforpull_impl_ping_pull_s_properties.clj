(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties-data
  {
   (ds/opt :communitiesintegrationlivefyreslingeventfilter) config-node-property-string-spec
   })

(def com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties-spec
  (ds/spec
    {:name ::com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties
     :spec com-adobe-social-integrations-livefyre-user-pingforpull-impl-ping-pull-s-properties-data}))
