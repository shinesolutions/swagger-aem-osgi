(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-properties-spec
   })

(def com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-info-spec
  (ds/spec
    {:name ::com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-info
     :spec com-adobe-cq-wcm-translation-impl-translation-platform-configuration-impl-info-data}))
