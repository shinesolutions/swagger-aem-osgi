(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-i18n-impl-bundle-pseudo-translations-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-i18n-impl-bundle-pseudo-translations-properties-data
  {
   (ds/opt :pseudopatterns) config-node-property-array-spec
   })

(def com-adobe-granite-i18n-impl-bundle-pseudo-translations-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-i18n-impl-bundle-pseudo-translations-properties
     :spec com-adobe-granite-i18n-impl-bundle-pseudo-translations-properties-data}))
