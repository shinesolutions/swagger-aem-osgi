(ns adobe-experience-manager-osgi-config-(aem)-api.specs.adaptive-form-and-interactive-communication-web-channel-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def adaptive-form-and-interactive-communication-web-channel-configuration-properties-data
  {
   (ds/opt :showPlaceholder) config-node-property-boolean-spec
   (ds/opt :maximumCacheEntries) config-node-property-integer-spec
   (ds/opt :afscriptingcompatversion) config-node-property-drop-down-spec
   (ds/opt :makeFileNameUnique) config-node-property-boolean-spec
   (ds/opt :generatingCompliantData) config-node-property-boolean-spec
   })

(def adaptive-form-and-interactive-communication-web-channel-configuration-properties-spec
  (ds/spec
    {:name ::adaptive-form-and-interactive-communication-web-channel-configuration-properties
     :spec adaptive-form-and-interactive-communication-web-channel-configuration-properties-data}))
