(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-acp-platform-platform-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-acp-platform-platform-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-acp-platform-platform-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-acp-platform-platform-servlet-properties-spec
   })

(def com-adobe-granite-acp-platform-platform-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-granite-acp-platform-platform-servlet-info
     :spec com-adobe-granite-acp-platform-platform-servlet-info-data}))
