(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-crx-security-token-impl-impl-token-authentication-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-crx-security-token-impl-impl-token-authentication-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :tokenrequiredattr) config-node-property-drop-down-spec
   (ds/opt :tokenalternateurl) config-node-property-string-spec
   (ds/opt :tokenencapsulated) config-node-property-boolean-spec
   (ds/opt :skiptokenrefresh) config-node-property-array-spec
   })

(def com-day-crx-security-token-impl-impl-token-authentication-handler-properties-spec
  (ds/spec
    {:name ::com-day-crx-security-token-impl-impl-token-authentication-handler-properties
     :spec com-day-crx-security-token-impl-impl-token-authentication-handler-properties-data}))
