(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-jcrclustersupport-cluster-start-level-controller-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-jcrclustersupport-cluster-start-level-controller-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-jcrclustersupport-cluster-start-level-controller-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-jcrclustersupport-cluster-start-level-controller-properties-spec
   })

(def com-day-cq-jcrclustersupport-cluster-start-level-controller-info-spec
  (ds/spec
    {:name ::com-day-cq-jcrclustersupport-cluster-start-level-controller-info
     :spec com-day-cq-jcrclustersupport-cluster-start-level-controller-info-data}))
