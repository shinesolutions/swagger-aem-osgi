//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties.g.dart';

/// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
///
/// Properties:
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodPort] 
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodUser] 
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodPassword] 
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodExcluded] 
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodIncluded] 
/// * [comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodClientPeriodCertificate] 
@BuiltValue()
abstract class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties implements Built<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.port')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodPort;

  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.keystore.user')
  ConfigNodePropertyString? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodUser;

  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.keystore.password')
  ConfigNodePropertyString? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodPassword;

  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.ciphersuites.excluded')
  ConfigNodePropertyArray? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodExcluded;

  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.ciphersuites.included')
  ConfigNodePropertyArray? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodIncluded;

  @BuiltValueField(wireName: r'com.adobe.granite.jetty.ssl.client.certificate')
  ConfigNodePropertyDropDown? get comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodClientPeriodCertificate;

  ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties._();

  factory ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties([void updates(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder b)]) = _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties> get serializer => _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesSerializer();
}

class _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties, _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties];

  @override
  final String wireName = r'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodPort != null) {
      yield r'com.adobe.granite.jetty.ssl.port';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodPort,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodUser != null) {
      yield r'com.adobe.granite.jetty.ssl.keystore.user';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodPassword != null) {
      yield r'com.adobe.granite.jetty.ssl.keystore.password';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodExcluded != null) {
      yield r'com.adobe.granite.jetty.ssl.ciphersuites.excluded';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodExcluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodIncluded != null) {
      yield r'com.adobe.granite.jetty.ssl.ciphersuites.included';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodIncluded,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodClientPeriodCertificate != null) {
      yield r'com.adobe.granite.jetty.ssl.client.certificate';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodClientPeriodCertificate,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.granite.jetty.ssl.port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodPort.replace(valueDes);
          break;
        case r'com.adobe.granite.jetty.ssl.keystore.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodUser.replace(valueDes);
          break;
        case r'com.adobe.granite.jetty.ssl.keystore.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodKeystorePeriodPassword.replace(valueDes);
          break;
        case r'com.adobe.granite.jetty.ssl.ciphersuites.excluded':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodExcluded.replace(valueDes);
          break;
        case r'com.adobe.granite.jetty.ssl.ciphersuites.included':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodCiphersuitesPeriodIncluded.replace(valueDes);
          break;
        case r'com.adobe.granite.jetty.ssl.client.certificate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodJettyPeriodSslPeriodClientPeriodCertificate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder();
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

