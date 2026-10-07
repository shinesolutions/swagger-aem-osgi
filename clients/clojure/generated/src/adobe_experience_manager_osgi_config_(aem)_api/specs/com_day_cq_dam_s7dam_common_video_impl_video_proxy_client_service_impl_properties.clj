(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-properties-data
  {
   (ds/opt :cqdams7damvideoproxyclientservicemultipartuploadminsizename) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientservicemultipartuploadpartsizename) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientservicemultipartuploadnumthreadname) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientservicehttpreadtimeoutname) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientservicehttpconnectiontimeoutname) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientservicehttpmaxretrycountname) config-node-property-integer-spec
   (ds/opt :cqdams7damvideoproxyclientserviceuploadprogressintervalname) config-node-property-integer-spec
   })

(def com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-properties
     :spec com-day-cq-dam-s7dam-common-video-impl-video-proxy-client-service-impl-properties-data}))
