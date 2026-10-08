(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-forms-common-servlet-temp-clean-up-task-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-forms-common-servlet-temp-clean-up-task-properties-data
  {
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :DurationforTemporaryStorage) config-node-property-string-spec
   (ds/opt :DurationforAnonymousStorage) config-node-property-string-spec
   })

(def com-adobe-forms-common-servlet-temp-clean-up-task-properties-spec
  (ds/spec
    {:name ::com-adobe-forms-common-servlet-temp-clean-up-task-properties
     :spec com-adobe-forms-common-servlet-temp-clean-up-task-properties-data}))
