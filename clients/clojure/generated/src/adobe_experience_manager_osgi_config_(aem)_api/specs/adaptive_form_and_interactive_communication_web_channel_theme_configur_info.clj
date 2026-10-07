(ns adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-theme-configur-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-theme-configur-properties :refer :all]
            )
  (:import (java.io File)))


(def adaptive-form-and-interactive-communication-web-channel-theme-configur-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) adaptive-form-and-interactive-communication-web-channel-theme-configur-properties-spec
   })

(def adaptive-form-and-interactive-communication-web-channel-theme-configur-info-spec
  (ds/spec
    {:name ::adaptive-form-and-interactive-communication-web-channel-theme-configur-info
     :spec adaptive-form-and-interactive-communication-web-channel-theme-configur-info-data}))
