(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties-data
  {
   (ds/opt :securitypreferencesname) config-node-property-string-spec
   })

(def com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties
     :spec com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties-data}))
