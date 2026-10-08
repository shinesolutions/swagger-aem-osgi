(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-i18n-impl-preferences-locale-resolver-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-i18n-impl-preferences-locale-resolver-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-i18n-impl-preferences-locale-resolver-service-properties-spec
   })

(def com-adobe-granite-i18n-impl-preferences-locale-resolver-service-info-spec
  (ds/spec
    {:name ::com-adobe-granite-i18n-impl-preferences-locale-resolver-service-info
     :spec com-adobe-granite-i18n-impl-preferences-locale-resolver-service-info-data}))
