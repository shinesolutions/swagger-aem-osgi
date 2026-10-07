(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-properties-spec
   })

(def com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-info
     :spec com-adobe-cq-social-datastore-op-impl-social-ms-resource-provider-factory-info-data}))
