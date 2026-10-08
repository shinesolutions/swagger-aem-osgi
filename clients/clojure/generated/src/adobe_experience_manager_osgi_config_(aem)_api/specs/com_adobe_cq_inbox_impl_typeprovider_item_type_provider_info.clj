(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-inbox-impl-typeprovider-item-type-provider-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-inbox-impl-typeprovider-item-type-provider-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-inbox-impl-typeprovider-item-type-provider-properties-spec
   })

(def com-adobe-cq-inbox-impl-typeprovider-item-type-provider-info-spec
  (ds/spec
    {:name ::com-adobe-cq-inbox-impl-typeprovider-item-type-provider-info
     :spec com-adobe-cq-inbox-impl-typeprovider-item-type-provider-info-data}))
