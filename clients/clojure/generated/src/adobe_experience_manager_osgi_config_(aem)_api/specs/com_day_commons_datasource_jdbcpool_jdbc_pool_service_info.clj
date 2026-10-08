(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-commons-datasource-jdbcpool-jdbc-pool-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-commons-datasource-jdbcpool-jdbc-pool-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-commons-datasource-jdbcpool-jdbc-pool-service-properties-spec
   })

(def com-day-commons-datasource-jdbcpool-jdbc-pool-service-info-spec
  (ds/spec
    {:name ::com-day-commons-datasource-jdbcpool-jdbc-pool-service-info
     :spec com-day-commons-datasource-jdbcpool-jdbc-pool-service-info-data}))
