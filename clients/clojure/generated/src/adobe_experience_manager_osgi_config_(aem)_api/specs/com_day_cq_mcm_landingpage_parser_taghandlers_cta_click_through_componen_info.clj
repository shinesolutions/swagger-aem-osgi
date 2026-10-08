(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-properties-spec
   })

(def com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-info-spec
  (ds/spec
    {:name ::com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-info
     :spec com-day-cq-mcm-landingpage-parser-taghandlers-cta-click-through-componen-info-data}))
