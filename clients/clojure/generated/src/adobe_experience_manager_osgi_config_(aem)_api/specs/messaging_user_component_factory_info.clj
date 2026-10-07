(ns adobe-experience-manager-osgi-config-(aem)-api.specs.messaging-user-component-factory-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.messaging-user-component-factory-properties :refer :all]
            )
  (:import (java.io File)))


(def messaging-user-component-factory-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) messaging-user-component-factory-properties-spec
   })

(def messaging-user-component-factory-info-spec
  (ds/spec
    {:name ::messaging-user-component-factory-info
     :spec messaging-user-component-factory-info-data}))
