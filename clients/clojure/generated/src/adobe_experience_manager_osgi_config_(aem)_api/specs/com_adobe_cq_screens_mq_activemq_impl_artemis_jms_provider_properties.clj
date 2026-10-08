(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :globalsize) config-node-property-integer-spec
   (ds/opt :maxdiskusage) config-node-property-integer-spec
   (ds/opt :persistenceenabled) config-node-property-boolean-spec
   (ds/opt :threadpoolmaxsize) config-node-property-integer-spec
   (ds/opt :scheduledthreadpoolmaxsize) config-node-property-integer-spec
   (ds/opt :gracefulshutdowntimeout) config-node-property-integer-spec
   (ds/opt :queues) config-node-property-array-spec
   (ds/opt :topics) config-node-property-array-spec
   (ds/opt :addressesmaxdeliveryattempts) config-node-property-integer-spec
   (ds/opt :addressesexpirydelay) config-node-property-integer-spec
   (ds/opt :addressesaddressfullmessagepolicy) config-node-property-drop-down-spec
   (ds/opt :addressesmaxsizebytes) config-node-property-integer-spec
   (ds/opt :addressespagesizebytes) config-node-property-integer-spec
   (ds/opt :addressespagecachemaxsize) config-node-property-integer-spec
   (ds/opt :clusteruser) config-node-property-string-spec
   (ds/opt :clusterpassword) config-node-property-string-spec
   (ds/opt :clustercalltimeout) config-node-property-integer-spec
   (ds/opt :clustercallfailovertimeout) config-node-property-integer-spec
   (ds/opt :clusterclientfailurecheckperiod) config-node-property-integer-spec
   (ds/opt :clusternotificationattempts) config-node-property-integer-spec
   (ds/opt :clusternotificationinterval) config-node-property-integer-spec
   (ds/opt :idcachesize) config-node-property-integer-spec
   (ds/opt :clusterconfirmationwindowsize) config-node-property-integer-spec
   (ds/opt :clusterconnectionttl) config-node-property-integer-spec
   (ds/opt :clusterduplicatedetection) config-node-property-boolean-spec
   (ds/opt :clusterinitialconnectattempts) config-node-property-integer-spec
   (ds/opt :clustermaxretryinterval) config-node-property-integer-spec
   (ds/opt :clusterminlargemessagesize) config-node-property-integer-spec
   (ds/opt :clusterproducerwindowsize) config-node-property-integer-spec
   (ds/opt :clusterreconnectattempts) config-node-property-integer-spec
   (ds/opt :clusterretryinterval) config-node-property-integer-spec
   (ds/opt :clusterretryintervalmultiplier) config-node-property-float-spec
   })

(def com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties
     :spec com-adobe-cq-screens-mq-activemq-impl-artemis-jms-provider-properties-data}))
