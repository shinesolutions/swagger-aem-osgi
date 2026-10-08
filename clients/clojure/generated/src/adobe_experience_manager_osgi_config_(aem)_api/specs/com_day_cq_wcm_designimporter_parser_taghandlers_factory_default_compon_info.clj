(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-properties-spec
   })

(def com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-info-spec
  (ds/spec
    {:name ::com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-info
     :spec com-day-cq-wcm-designimporter-parser-taghandlers-factory-default-compon-info-data}))
