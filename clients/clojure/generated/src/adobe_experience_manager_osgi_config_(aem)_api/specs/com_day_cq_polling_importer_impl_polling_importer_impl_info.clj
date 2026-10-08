(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-polling-importer-impl-polling-importer-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-polling-importer-impl-polling-importer-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-polling-importer-impl-polling-importer-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-polling-importer-impl-polling-importer-impl-properties-spec
   })

(def com-day-cq-polling-importer-impl-polling-importer-impl-info-spec
  (ds/spec
    {:name ::com-day-cq-polling-importer-impl-polling-importer-impl-info
     :spec com-day-cq-polling-importer-impl-polling-importer-impl-info-data}))
