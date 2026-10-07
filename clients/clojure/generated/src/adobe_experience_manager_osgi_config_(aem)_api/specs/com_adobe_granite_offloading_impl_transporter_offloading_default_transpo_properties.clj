(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-properties-data
  {
   (ds/opt :defaulttransportagent-to-workerprefix) config-node-property-string-spec
   (ds/opt :defaulttransportagent-to-masterprefix) config-node-property-string-spec
   (ds/opt :defaulttransportinputpackage) config-node-property-string-spec
   (ds/opt :defaulttransportoutputpackage) config-node-property-string-spec
   (ds/opt :defaulttransportreplicationsynchronous) config-node-property-boolean-spec
   (ds/opt :defaulttransportcontentpackage) config-node-property-boolean-spec
   (ds/opt :offloadingtransporterdefaultenabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-properties
     :spec com-adobe-granite-offloading-impl-transporter-offloading-default-transpo-properties-data}))
