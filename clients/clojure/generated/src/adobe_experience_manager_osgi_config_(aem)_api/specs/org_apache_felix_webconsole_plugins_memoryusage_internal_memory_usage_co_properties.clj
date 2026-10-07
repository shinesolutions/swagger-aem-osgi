(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties-data
  {
   (ds/opt :felixmemoryusagedumpthreshold) config-node-property-integer-spec
   (ds/opt :felixmemoryusagedumpinterval) config-node-property-integer-spec
   (ds/opt :felixmemoryusagedumplocation) config-node-property-string-spec
   })

(def org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties-spec
  (ds/spec
    {:name ::org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties
     :spec org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties-data}))
