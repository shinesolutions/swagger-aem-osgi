(ns adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-theme-configur-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def adaptive-form-and-interactive-communication-web-channel-theme-configur-properties-data
  {
   (ds/opt :fontList) config-node-property-array-spec
   })

(def adaptive-form-and-interactive-communication-web-channel-theme-configur-properties-spec
  (ds/spec
    {:name ::adaptive-form-and-interactive-communication-web-channel-theme-configur-properties
     :spec adaptive-form-and-interactive-communication-web-channel-theme-configur-properties-data}))
