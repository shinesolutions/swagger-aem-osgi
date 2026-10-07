(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-audit-purge-dam-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-audit-purge-dam-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-audit-purge-dam-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-audit-purge-dam-properties-spec
   })

(def com-adobe-cq-audit-purge-dam-info-spec
  (ds/spec
    {:name ::com-adobe-cq-audit-purge-dam-info
     :spec com-adobe-cq-audit-purge-dam-info-data}))
