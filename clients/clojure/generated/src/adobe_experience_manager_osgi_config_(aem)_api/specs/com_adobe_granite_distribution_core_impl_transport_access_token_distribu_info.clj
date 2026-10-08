(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-transport-access-token-distribu-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-distribution-core-impl-transport-access-token-distribu-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-distribution-core-impl-transport-access-token-distribu-properties-spec
   })

(def com-adobe-granite-distribution-core-impl-transport-access-token-distribu-info-spec
  (ds/spec
    {:name ::com-adobe-granite-distribution-core-impl-transport-access-token-distribu-info
     :spec com-adobe-granite-distribution-core-impl-transport-access-token-distribu-info-data}))
