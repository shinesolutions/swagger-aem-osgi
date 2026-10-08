(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-companion-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-companion-servlet-properties-data
  {
   (ds/opt :MoreInfo) config-node-property-string-spec
   (ds/opt :mntoverlaydamguicontentassetsmoreinfohtmlpath) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-servlet-companion-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-companion-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-companion-servlet-properties-data}))
