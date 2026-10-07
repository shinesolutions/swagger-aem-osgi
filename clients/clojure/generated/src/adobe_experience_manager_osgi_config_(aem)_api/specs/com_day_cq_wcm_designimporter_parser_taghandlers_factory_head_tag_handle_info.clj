(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-properties-spec
   })

(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-info
     :spec com-day-cq-wcm-designimporter-parser-taghandlers-factory-head-tag-handle-info-data}))
