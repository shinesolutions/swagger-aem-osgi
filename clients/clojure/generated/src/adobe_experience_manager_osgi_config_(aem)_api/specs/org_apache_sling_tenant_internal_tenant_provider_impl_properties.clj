(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-tenant-internal-tenant-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-tenant-internal-tenant-provider-impl-properties-data
  {
   (ds/opt :tenantroot) config-node-property-string-spec
   (ds/opt :tenantpathmatcher) config-node-property-array-spec
   })

(def org-apache-sling-tenant-internal-tenant-provider-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-tenant-internal-tenant-provider-impl-properties
     :spec org-apache-sling-tenant-internal-tenant-provider-impl-properties-data}))
