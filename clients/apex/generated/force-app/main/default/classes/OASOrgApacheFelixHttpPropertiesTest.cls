@isTest
private class OASOrgApacheFelixHttpPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = orgApacheFelixHttpProperties1;
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = orgApacheFelixHttpProperties3;

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assert(orgApacheFelixHttpProperties4.equals(orgApacheFelixHttpProperties3));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = new OASOrgApacheFelixHttpProperties();

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assert(orgApacheFelixHttpProperties4.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();

        System.assertEquals(false, orgApacheFelixHttpProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixHttpProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3;

        System.assertEquals(false, orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties3));
        System.assertEquals(false, orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();

        System.assertEquals(orgApacheFelixHttpProperties1.hashCode(), orgApacheFelixHttpProperties1.hashCode());
        System.assertEquals(orgApacheFelixHttpProperties2.hashCode(), orgApacheFelixHttpProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = new OASOrgApacheFelixHttpProperties();

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assertEquals(orgApacheFelixHttpProperties1.hashCode(), orgApacheFelixHttpProperties2.hashCode());
        System.assertEquals(orgApacheFelixHttpProperties3.hashCode(), orgApacheFelixHttpProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties = new OASOrgApacheFelixHttpProperties();
        Map<String, String> x-property-mappings = orgApacheFelixHttpProperties.getx-property-mappings();
        System.assertEquals('orgApacheFelixHttpHost', x-property-mappings.get('org.apache.felix.http.host'));
        System.assertEquals('orgApacheFelixHttpEnable', x-property-mappings.get('org.apache.felix.http.enable'));
        System.assertEquals('orgOsgiServiceHttpPort', x-property-mappings.get('org.osgi.service.http.port'));
        System.assertEquals('orgApacheFelixHttpTimeout', x-property-mappings.get('org.apache.felix.http.timeout'));
        System.assertEquals('orgApacheFelixHttpsEnable', x-property-mappings.get('org.apache.felix.https.enable'));
        System.assertEquals('orgOsgiServiceHttpPortSecure', x-property-mappings.get('org.osgi.service.http.port.secure'));
        System.assertEquals('orgApacheFelixHttpsKeystore', x-property-mappings.get('org.apache.felix.https.keystore'));
        System.assertEquals('orgApacheFelixHttpsKeystorePassword', x-property-mappings.get('org.apache.felix.https.keystore.password'));
        System.assertEquals('orgApacheFelixHttpsKeystoreKeyPassword', x-property-mappings.get('org.apache.felix.https.keystore.key.password'));
        System.assertEquals('orgApacheFelixHttpsTruststore', x-property-mappings.get('org.apache.felix.https.truststore'));
        System.assertEquals('orgApacheFelixHttpsTruststorePassword', x-property-mappings.get('org.apache.felix.https.truststore.password'));
        System.assertEquals('orgApacheFelixHttpsClientcertificate', x-property-mappings.get('org.apache.felix.https.clientcertificate'));
        System.assertEquals('orgApacheFelixHttpContextPath', x-property-mappings.get('org.apache.felix.http.context_path'));
        System.assertEquals('orgApacheFelixHttpMbeans', x-property-mappings.get('org.apache.felix.http.mbeans'));
        System.assertEquals('orgApacheFelixHttpSessionTimeout', x-property-mappings.get('org.apache.felix.http.session.timeout'));
        System.assertEquals('orgApacheFelixHttpJettyThreadpoolMax', x-property-mappings.get('org.apache.felix.http.jetty.threadpool.max'));
        System.assertEquals('orgApacheFelixHttpJettyAcceptors', x-property-mappings.get('org.apache.felix.http.jetty.acceptors'));
        System.assertEquals('orgApacheFelixHttpJettySelectors', x-property-mappings.get('org.apache.felix.http.jetty.selectors'));
        System.assertEquals('orgApacheFelixHttpJettyHeaderBufferSize', x-property-mappings.get('org.apache.felix.http.jetty.headerBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyRequestBufferSize', x-property-mappings.get('org.apache.felix.http.jetty.requestBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyResponseBufferSize', x-property-mappings.get('org.apache.felix.http.jetty.responseBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyMaxFormSize', x-property-mappings.get('org.apache.felix.http.jetty.maxFormSize'));
        System.assertEquals('orgApacheFelixHttpPathExclusions', x-property-mappings.get('org.apache.felix.http.path_exclusions'));
        System.assertEquals('orgApacheFelixHttpsJettyCiphersuitesExcluded', x-property-mappings.get('org.apache.felix.https.jetty.ciphersuites.excluded'));
        System.assertEquals('orgApacheFelixHttpsJettyCiphersuitesIncluded', x-property-mappings.get('org.apache.felix.https.jetty.ciphersuites.included'));
        System.assertEquals('orgApacheFelixHttpJettySendServerHeader', x-property-mappings.get('org.apache.felix.http.jetty.sendServerHeader'));
        System.assertEquals('orgApacheFelixHttpsJettyProtocolsIncluded', x-property-mappings.get('org.apache.felix.https.jetty.protocols.included'));
        System.assertEquals('orgApacheFelixHttpsJettyProtocolsExcluded', x-property-mappings.get('org.apache.felix.https.jetty.protocols.excluded'));
        System.assertEquals('orgApacheFelixProxyLoadBalancerConnectionEnable', x-property-mappings.get('org.apache.felix.proxy.load.balancer.connection.enable'));
        System.assertEquals('orgApacheFelixHttpsJettyRenegotiateAllowed', x-property-mappings.get('org.apache.felix.https.jetty.renegotiateAllowed'));
        System.assertEquals('orgApacheFelixHttpsJettySessionCookieHttpOnly', x-property-mappings.get('org.apache.felix.https.jetty.session.cookie.httpOnly'));
        System.assertEquals('orgApacheFelixHttpsJettySessionCookieSecure', x-property-mappings.get('org.apache.felix.https.jetty.session.cookie.secure'));
        System.assertEquals('orgEclipseJettyServletSessionIdPathParameterName', x-property-mappings.get('org.eclipse.jetty.servlet.SessionIdPathParameterName'));
        System.assertEquals('orgEclipseJettyServletCheckingRemoteSessionIdEncoding', x-property-mappings.get('org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding'));
        System.assertEquals('orgEclipseJettyServletSessionCookie', x-property-mappings.get('org.eclipse.jetty.servlet.SessionCookie'));
        System.assertEquals('orgEclipseJettyServletSessionDomain', x-property-mappings.get('org.eclipse.jetty.servlet.SessionDomain'));
        System.assertEquals('orgEclipseJettyServletSessionPath', x-property-mappings.get('org.eclipse.jetty.servlet.SessionPath'));
        System.assertEquals('orgEclipseJettyServletMaxAge', x-property-mappings.get('org.eclipse.jetty.servlet.MaxAge'));
        System.assertEquals('orgApacheFelixHttpName', x-property-mappings.get('org.apache.felix.http.name'));
        System.assertEquals('orgApacheFelixJettyGziphandlerEnable', x-property-mappings.get('org.apache.felix.jetty.gziphandler.enable'));
        System.assertEquals('orgApacheFelixJettyGzipMinGzipSize', x-property-mappings.get('org.apache.felix.jetty.gzip.minGzipSize'));
        System.assertEquals('orgApacheFelixJettyGzipCompressionLevel', x-property-mappings.get('org.apache.felix.jetty.gzip.compressionLevel'));
        System.assertEquals('orgApacheFelixJettyGzipInflateBufferSize', x-property-mappings.get('org.apache.felix.jetty.gzip.inflateBufferSize'));
        System.assertEquals('orgApacheFelixJettyGzipSyncFlush', x-property-mappings.get('org.apache.felix.jetty.gzip.syncFlush'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedUserAgents', x-property-mappings.get('org.apache.felix.jetty.gzip.excludedUserAgents'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedMethods', x-property-mappings.get('org.apache.felix.jetty.gzip.includedMethods'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedMethods', x-property-mappings.get('org.apache.felix.jetty.gzip.excludedMethods'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedPaths', x-property-mappings.get('org.apache.felix.jetty.gzip.includedPaths'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedPaths', x-property-mappings.get('org.apache.felix.jetty.gzip.excludedPaths'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedMimeTypes', x-property-mappings.get('org.apache.felix.jetty.gzip.includedMimeTypes'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedMimeTypes', x-property-mappings.get('org.apache.felix.jetty.gzip.excludedMimeTypes'));
        System.assertEquals('orgApacheFelixHttpSessionInvalidate', x-property-mappings.get('org.apache.felix.http.session.invalidate'));
        System.assertEquals('orgApacheFelixHttpSessionUniqueid', x-property-mappings.get('org.apache.felix.http.session.uniqueid'));
    }
}
