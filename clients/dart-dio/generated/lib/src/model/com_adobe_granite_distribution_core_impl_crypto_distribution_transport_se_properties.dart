//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
///
/// Properties:
/// * [name] 
/// * [username] 
/// * [encryptedPassword] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties implements Built<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'username')
  ConfigNodePropertyString? get username;

  @BuiltValueField(wireName: r'encryptedPassword')
  ConfigNodePropertyString? get encryptedPassword;

  ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties._();

  factory ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties([void updates(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties, _$ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.encryptedPassword != null) {
      yield r'encryptedPassword';
      yield serializers.serialize(
        object.encryptedPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.username.replace(valueDes);
          break;
        case r'encryptedPassword':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.encryptedPassword.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder();
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

