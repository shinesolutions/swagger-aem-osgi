(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties-data
  {
   (ds/opt :portaloutboxes) config-node-property-array-spec
   (ds/opt :draftdataservice) config-node-property-string-spec
   (ds/opt :draftmetadataservice) config-node-property-string-spec
   (ds/opt :submitdataservice) config-node-property-string-spec
   (ds/opt :submitmetadataservice) config-node-property-string-spec
   (ds/opt :pendingSigndataservice) config-node-property-string-spec
   (ds/opt :pendingSignmetadataservice) config-node-property-string-spec
   })

(def com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties-spec
  (ds/spec
    {:name ::com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties
     :spec com-adobe-fd-fp-config-forms-portal-draftsand-submission-config-service-properties-data}))
