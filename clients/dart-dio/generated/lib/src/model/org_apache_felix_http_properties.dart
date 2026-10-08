//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_http_properties.g.dart';

/// OrgApacheFelixHttpProperties
///
/// Properties:
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodHost] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodEnable] 
/// * [orgPeriodOsgiPeriodServicePeriodHttpPeriodPort] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodTimeout] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable] 
/// * [orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodContextPath] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodMbeans] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodTimeout] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodThreadpoolPeriodMax] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodAcceptors] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSelectors] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodHeaderBufferSize] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodRequestBufferSize] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodResponseBufferSize] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodMaxFormSize] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodPathExclusions] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodExcluded] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodIncluded] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSendServerHeader] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodIncluded] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodExcluded] 
/// * [orgPeriodApachePeriodFelixPeriodProxyPeriodLoadPeriodBalancerPeriodConnectionPeriodEnable] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodRenegotiateAllowed] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodHttpOnly] 
/// * [orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodSecure] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionIdPathParameterName] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodCheckingRemoteSessionIdEncoding] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionCookie] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionDomain] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionPath] 
/// * [orgPeriodEclipsePeriodJettyPeriodServletPeriodMaxAge] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodName] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGziphandlerPeriodEnable] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodMinGzipSize] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodCompressionLevel] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodInflateBufferSize] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodSyncFlush] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedUserAgents] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMethods] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMethods] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedPaths] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedPaths] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMimeTypes] 
/// * [orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMimeTypes] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodInvalidate] 
/// * [orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodUniqueid] 
@BuiltValue()
abstract class OrgApacheFelixHttpProperties implements Built<OrgApacheFelixHttpProperties, OrgApacheFelixHttpPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.felix.http.host')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpPeriodHost;

  @BuiltValueField(wireName: r'org.apache.felix.http.enable')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpPeriodEnable;

  @BuiltValueField(wireName: r'org.osgi.service.http.port')
  ConfigNodePropertyInteger? get orgPeriodOsgiPeriodServicePeriodHttpPeriodPort;

  @BuiltValueField(wireName: r'org.apache.felix.http.timeout')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodTimeout;

  @BuiltValueField(wireName: r'org.apache.felix.https.enable')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable;

  @BuiltValueField(wireName: r'org.osgi.service.http.port.secure')
  ConfigNodePropertyInteger? get orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure;

  @BuiltValueField(wireName: r'org.apache.felix.https.keystore')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore;

  @BuiltValueField(wireName: r'org.apache.felix.https.keystore.password')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword;

  @BuiltValueField(wireName: r'org.apache.felix.https.keystore.key.password')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword;

  @BuiltValueField(wireName: r'org.apache.felix.https.truststore')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore;

  @BuiltValueField(wireName: r'org.apache.felix.https.truststore.password')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword;

  @BuiltValueField(wireName: r'org.apache.felix.https.clientcertificate')
  ConfigNodePropertyDropDown? get orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate;

  @BuiltValueField(wireName: r'org.apache.felix.http.context_path')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpPeriodContextPath;

  @BuiltValueField(wireName: r'org.apache.felix.http.mbeans')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpPeriodMbeans;

  @BuiltValueField(wireName: r'org.apache.felix.http.session.timeout')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodTimeout;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.threadpool.max')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodThreadpoolPeriodMax;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.acceptors')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodAcceptors;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.selectors')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSelectors;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.headerBufferSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodHeaderBufferSize;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.requestBufferSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodRequestBufferSize;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.responseBufferSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodResponseBufferSize;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.maxFormSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodMaxFormSize;

  @BuiltValueField(wireName: r'org.apache.felix.http.path_exclusions')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodHttpPeriodPathExclusions;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.ciphersuites.excluded')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodExcluded;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.ciphersuites.included')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodIncluded;

  @BuiltValueField(wireName: r'org.apache.felix.http.jetty.sendServerHeader')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSendServerHeader;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.protocols.included')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodIncluded;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.protocols.excluded')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodExcluded;

  @BuiltValueField(wireName: r'org.apache.felix.proxy.load.balancer.connection.enable')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodProxyPeriodLoadPeriodBalancerPeriodConnectionPeriodEnable;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.renegotiateAllowed')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodRenegotiateAllowed;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.session.cookie.httpOnly')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodHttpOnly;

  @BuiltValueField(wireName: r'org.apache.felix.https.jetty.session.cookie.secure')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodSecure;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.SessionIdPathParameterName')
  ConfigNodePropertyString? get orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionIdPathParameterName;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding')
  ConfigNodePropertyBoolean? get orgPeriodEclipsePeriodJettyPeriodServletPeriodCheckingRemoteSessionIdEncoding;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.SessionCookie')
  ConfigNodePropertyString? get orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionCookie;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.SessionDomain')
  ConfigNodePropertyString? get orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionDomain;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.SessionPath')
  ConfigNodePropertyString? get orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionPath;

  @BuiltValueField(wireName: r'org.eclipse.jetty.servlet.MaxAge')
  ConfigNodePropertyInteger? get orgPeriodEclipsePeriodJettyPeriodServletPeriodMaxAge;

  @BuiltValueField(wireName: r'org.apache.felix.http.name')
  ConfigNodePropertyString? get orgPeriodApachePeriodFelixPeriodHttpPeriodName;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gziphandler.enable')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodJettyPeriodGziphandlerPeriodEnable;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.minGzipSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodMinGzipSize;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.compressionLevel')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodCompressionLevel;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.inflateBufferSize')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodInflateBufferSize;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.syncFlush')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodSyncFlush;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.excludedUserAgents')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedUserAgents;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.includedMethods')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMethods;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.excludedMethods')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMethods;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.includedPaths')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedPaths;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.excludedPaths')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedPaths;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.includedMimeTypes')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMimeTypes;

  @BuiltValueField(wireName: r'org.apache.felix.jetty.gzip.excludedMimeTypes')
  ConfigNodePropertyArray? get orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMimeTypes;

  @BuiltValueField(wireName: r'org.apache.felix.http.session.invalidate')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodInvalidate;

  @BuiltValueField(wireName: r'org.apache.felix.http.session.uniqueid')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodUniqueid;

  OrgApacheFelixHttpProperties._();

  factory OrgApacheFelixHttpProperties([void updates(OrgApacheFelixHttpPropertiesBuilder b)]) = _$OrgApacheFelixHttpProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixHttpPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixHttpProperties> get serializer => _$OrgApacheFelixHttpPropertiesSerializer();
}

class _$OrgApacheFelixHttpPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixHttpProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixHttpProperties, _$OrgApacheFelixHttpProperties];

  @override
  final String wireName = r'OrgApacheFelixHttpProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixHttpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodHost != null) {
      yield r'org.apache.felix.http.host';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodEnable != null) {
      yield r'org.apache.felix.http.enable';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodOsgiPeriodServicePeriodHttpPeriodPort != null) {
      yield r'org.osgi.service.http.port';
      yield serializers.serialize(
        object.orgPeriodOsgiPeriodServicePeriodHttpPeriodPort,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodTimeout != null) {
      yield r'org.apache.felix.http.timeout';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable != null) {
      yield r'org.apache.felix.https.enable';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure != null) {
      yield r'org.osgi.service.http.port.secure';
      yield serializers.serialize(
        object.orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore != null) {
      yield r'org.apache.felix.https.keystore';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword != null) {
      yield r'org.apache.felix.https.keystore.password';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword != null) {
      yield r'org.apache.felix.https.keystore.key.password';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore != null) {
      yield r'org.apache.felix.https.truststore';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword != null) {
      yield r'org.apache.felix.https.truststore.password';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate != null) {
      yield r'org.apache.felix.https.clientcertificate';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodContextPath != null) {
      yield r'org.apache.felix.http.context_path';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodContextPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodMbeans != null) {
      yield r'org.apache.felix.http.mbeans';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodMbeans,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodTimeout != null) {
      yield r'org.apache.felix.http.session.timeout';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodThreadpoolPeriodMax != null) {
      yield r'org.apache.felix.http.jetty.threadpool.max';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodThreadpoolPeriodMax,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodAcceptors != null) {
      yield r'org.apache.felix.http.jetty.acceptors';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodAcceptors,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSelectors != null) {
      yield r'org.apache.felix.http.jetty.selectors';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodHeaderBufferSize != null) {
      yield r'org.apache.felix.http.jetty.headerBufferSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodHeaderBufferSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodRequestBufferSize != null) {
      yield r'org.apache.felix.http.jetty.requestBufferSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodRequestBufferSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodResponseBufferSize != null) {
      yield r'org.apache.felix.http.jetty.responseBufferSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodResponseBufferSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodMaxFormSize != null) {
      yield r'org.apache.felix.http.jetty.maxFormSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodMaxFormSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodPathExclusions != null) {
      yield r'org.apache.felix.http.path_exclusions';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodPathExclusions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodExcluded != null) {
      yield r'org.apache.felix.https.jetty.ciphersuites.excluded';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodExcluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodIncluded != null) {
      yield r'org.apache.felix.https.jetty.ciphersuites.included';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodIncluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSendServerHeader != null) {
      yield r'org.apache.felix.http.jetty.sendServerHeader';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSendServerHeader,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodIncluded != null) {
      yield r'org.apache.felix.https.jetty.protocols.included';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodIncluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodExcluded != null) {
      yield r'org.apache.felix.https.jetty.protocols.excluded';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodExcluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodProxyPeriodLoadPeriodBalancerPeriodConnectionPeriodEnable != null) {
      yield r'org.apache.felix.proxy.load.balancer.connection.enable';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodProxyPeriodLoadPeriodBalancerPeriodConnectionPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodRenegotiateAllowed != null) {
      yield r'org.apache.felix.https.jetty.renegotiateAllowed';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodRenegotiateAllowed,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodHttpOnly != null) {
      yield r'org.apache.felix.https.jetty.session.cookie.httpOnly';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodHttpOnly,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodSecure != null) {
      yield r'org.apache.felix.https.jetty.session.cookie.secure';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodSecure,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionIdPathParameterName != null) {
      yield r'org.eclipse.jetty.servlet.SessionIdPathParameterName';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionIdPathParameterName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodCheckingRemoteSessionIdEncoding != null) {
      yield r'org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodCheckingRemoteSessionIdEncoding,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionCookie != null) {
      yield r'org.eclipse.jetty.servlet.SessionCookie';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionCookie,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionDomain != null) {
      yield r'org.eclipse.jetty.servlet.SessionDomain';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionDomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionPath != null) {
      yield r'org.eclipse.jetty.servlet.SessionPath';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodEclipsePeriodJettyPeriodServletPeriodMaxAge != null) {
      yield r'org.eclipse.jetty.servlet.MaxAge';
      yield serializers.serialize(
        object.orgPeriodEclipsePeriodJettyPeriodServletPeriodMaxAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodName != null) {
      yield r'org.apache.felix.http.name';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGziphandlerPeriodEnable != null) {
      yield r'org.apache.felix.jetty.gziphandler.enable';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGziphandlerPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodMinGzipSize != null) {
      yield r'org.apache.felix.jetty.gzip.minGzipSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodMinGzipSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodCompressionLevel != null) {
      yield r'org.apache.felix.jetty.gzip.compressionLevel';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodCompressionLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodInflateBufferSize != null) {
      yield r'org.apache.felix.jetty.gzip.inflateBufferSize';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodInflateBufferSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodSyncFlush != null) {
      yield r'org.apache.felix.jetty.gzip.syncFlush';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodSyncFlush,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedUserAgents != null) {
      yield r'org.apache.felix.jetty.gzip.excludedUserAgents';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedUserAgents,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMethods != null) {
      yield r'org.apache.felix.jetty.gzip.includedMethods';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMethods != null) {
      yield r'org.apache.felix.jetty.gzip.excludedMethods';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedPaths != null) {
      yield r'org.apache.felix.jetty.gzip.includedPaths';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedPaths != null) {
      yield r'org.apache.felix.jetty.gzip.excludedPaths';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMimeTypes != null) {
      yield r'org.apache.felix.jetty.gzip.includedMimeTypes';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMimeTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMimeTypes != null) {
      yield r'org.apache.felix.jetty.gzip.excludedMimeTypes';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMimeTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodInvalidate != null) {
      yield r'org.apache.felix.http.session.invalidate';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodInvalidate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodUniqueid != null) {
      yield r'org.apache.felix.http.session.uniqueid';
      yield serializers.serialize(
        object.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodUniqueid,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixHttpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixHttpPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.felix.http.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodHost.replace(valueDes);
          break;
        case r'org.apache.felix.http.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodEnable.replace(valueDes);
          break;
        case r'org.osgi.service.http.port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodOsgiPeriodServicePeriodHttpPeriodPort.replace(valueDes);
          break;
        case r'org.apache.felix.http.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodTimeout.replace(valueDes);
          break;
        case r'org.apache.felix.https.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodEnable.replace(valueDes);
          break;
        case r'org.osgi.service.http.port.secure':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodOsgiPeriodServicePeriodHttpPeriodPortPeriodSecure.replace(valueDes);
          break;
        case r'org.apache.felix.https.keystore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystore.replace(valueDes);
          break;
        case r'org.apache.felix.https.keystore.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodPassword.replace(valueDes);
          break;
        case r'org.apache.felix.https.keystore.key.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodKeystorePeriodKeyPeriodPassword.replace(valueDes);
          break;
        case r'org.apache.felix.https.truststore':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststore.replace(valueDes);
          break;
        case r'org.apache.felix.https.truststore.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodTruststorePeriodPassword.replace(valueDes);
          break;
        case r'org.apache.felix.https.clientcertificate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodClientcertificate.replace(valueDes);
          break;
        case r'org.apache.felix.http.context_path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodContextPath.replace(valueDes);
          break;
        case r'org.apache.felix.http.mbeans':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodMbeans.replace(valueDes);
          break;
        case r'org.apache.felix.http.session.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodTimeout.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.threadpool.max':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodThreadpoolPeriodMax.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.acceptors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodAcceptors.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSelectors.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.headerBufferSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodHeaderBufferSize.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.requestBufferSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodRequestBufferSize.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.responseBufferSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodResponseBufferSize.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.maxFormSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodMaxFormSize.replace(valueDes);
          break;
        case r'org.apache.felix.http.path_exclusions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodPathExclusions.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.ciphersuites.excluded':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodExcluded.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.ciphersuites.included':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodCiphersuitesPeriodIncluded.replace(valueDes);
          break;
        case r'org.apache.felix.http.jetty.sendServerHeader':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodJettyPeriodSendServerHeader.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.protocols.included':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodIncluded.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.protocols.excluded':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodProtocolsPeriodExcluded.replace(valueDes);
          break;
        case r'org.apache.felix.proxy.load.balancer.connection.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodProxyPeriodLoadPeriodBalancerPeriodConnectionPeriodEnable.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.renegotiateAllowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodRenegotiateAllowed.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.session.cookie.httpOnly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodHttpOnly.replace(valueDes);
          break;
        case r'org.apache.felix.https.jetty.session.cookie.secure':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpsPeriodJettyPeriodSessionPeriodCookiePeriodSecure.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.SessionIdPathParameterName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionIdPathParameterName.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodCheckingRemoteSessionIdEncoding.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.SessionCookie':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionCookie.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.SessionDomain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionDomain.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.SessionPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodSessionPath.replace(valueDes);
          break;
        case r'org.eclipse.jetty.servlet.MaxAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodEclipsePeriodJettyPeriodServletPeriodMaxAge.replace(valueDes);
          break;
        case r'org.apache.felix.http.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodName.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gziphandler.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGziphandlerPeriodEnable.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.minGzipSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodMinGzipSize.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.compressionLevel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodCompressionLevel.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.inflateBufferSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodInflateBufferSize.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.syncFlush':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodSyncFlush.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.excludedUserAgents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedUserAgents.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.includedMethods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMethods.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.excludedMethods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMethods.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.includedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedPaths.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.excludedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedPaths.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.includedMimeTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodIncludedMimeTypes.replace(valueDes);
          break;
        case r'org.apache.felix.jetty.gzip.excludedMimeTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodJettyPeriodGzipPeriodExcludedMimeTypes.replace(valueDes);
          break;
        case r'org.apache.felix.http.session.invalidate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodInvalidate.replace(valueDes);
          break;
        case r'org.apache.felix.http.session.uniqueid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodFelixPeriodHttpPeriodSessionPeriodUniqueid.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixHttpProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixHttpPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

