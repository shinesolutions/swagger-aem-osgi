(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-audit-purge-replication-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-audit-purge-replication-properties-data
  {
   (ds/opt :auditlogrulename) config-node-property-string-spec
   (ds/opt :auditlogrulecontentpath) config-node-property-string-spec
   (ds/opt :auditlogruleminimumage) config-node-property-integer-spec
   (ds/opt :auditlogruletypes) config-node-property-drop-down-spec
   })

(def com-adobe-cq-audit-purge-replication-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-audit-purge-replication-properties
     :spec com-adobe-cq-audit-purge-replication-properties-data}))
