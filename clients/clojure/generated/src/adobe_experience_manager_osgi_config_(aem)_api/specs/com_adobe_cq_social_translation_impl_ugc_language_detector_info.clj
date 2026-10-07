(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-translation-impl-ugc-language-detector-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-translation-impl-ugc-language-detector-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-translation-impl-ugc-language-detector-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-translation-impl-ugc-language-detector-properties-spec
   })

(def com-adobe-cq-social-translation-impl-ugc-language-detector-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-translation-impl-ugc-language-detector-info
     :spec com-adobe-cq-social-translation-impl-ugc-language-detector-info-data}))
