(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-servlet-temp-clean-up-task-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-servlet-temp-clean-up-task-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-servlet-temp-clean-up-task-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-forms-common-servlet-temp-clean-up-task-properties-spec
   })

(def com-adobe-forms-common-servlet-temp-clean-up-task-info-spec
  (ds/spec
    {:name ::com-adobe-forms-common-servlet-temp-clean-up-task-info
     :spec com-adobe-forms-common-servlet-temp-clean-up-task-info-data}))
