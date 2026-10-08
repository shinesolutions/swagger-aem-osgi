//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties.g.dart';

/// ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
///
/// Properties:
/// * [authPeriodImsPeriodClientPeriodSecret] 
/// * [customizerPeriodType] 
@BuiltValue()
abstract class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties implements Built<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'auth.ims.client.secret')
  ConfigNodePropertyString? get authPeriodImsPeriodClientPeriodSecret;

  @BuiltValueField(wireName: r'customizer.type')
  ConfigNodePropertyString? get customizerPeriodType;

  ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties._();

  factory ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties([void updates(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties> get serializer => _$ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties, _$ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.authPeriodImsPeriodClientPeriodSecret != null) {
      yield r'auth.ims.client.secret';
      yield serializers.serialize(
        object.authPeriodImsPeriodClientPeriodSecret,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.customizerPeriodType != null) {
      yield r'customizer.type';
      yield serializers.serialize(
        object.customizerPeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auth.ims.client.secret':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodImsPeriodClientPeriodSecret.replace(valueDes);
          break;
        case r'customizer.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.customizerPeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder();
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

