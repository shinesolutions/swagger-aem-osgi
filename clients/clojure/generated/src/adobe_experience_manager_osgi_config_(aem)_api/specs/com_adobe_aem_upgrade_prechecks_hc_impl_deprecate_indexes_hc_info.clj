(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties-spec
   })

(def com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-info-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-info
     :spec com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-info-data}))
