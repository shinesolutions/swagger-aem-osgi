(ns adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def adaptive-form-and-interactive-communication-web-channel-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) adaptive-form-and-interactive-communication-web-channel-configuration-properties-spec
   })

(def adaptive-form-and-interactive-communication-web-channel-configuration-info-spec
  (ds/spec
    {:name ::adaptive-form-and-interactive-communication-web-channel-configuration-info
     :spec adaptive-form-and-interactive-communication-web-channel-configuration-info-data}))
