//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_optout_impl_opt_out_service_impl_properties.g.dart';

/// ComAdobeGraniteOptoutImplOptOutServiceImplProperties
///
/// Properties:
/// * [optoutPeriodCookies] 
/// * [optoutPeriodHeaders] 
/// * [optoutPeriodWhitelistPeriodCookies] 
@BuiltValue()
abstract class ComAdobeGraniteOptoutImplOptOutServiceImplProperties implements Built<ComAdobeGraniteOptoutImplOptOutServiceImplProperties, ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'optout.cookies')
  ConfigNodePropertyArray? get optoutPeriodCookies;

  @BuiltValueField(wireName: r'optout.headers')
  ConfigNodePropertyArray? get optoutPeriodHeaders;

  @BuiltValueField(wireName: r'optout.whitelist.cookies')
  ConfigNodePropertyArray? get optoutPeriodWhitelistPeriodCookies;

  ComAdobeGraniteOptoutImplOptOutServiceImplProperties._();

  factory ComAdobeGraniteOptoutImplOptOutServiceImplProperties([void updates(ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder b)]) = _$ComAdobeGraniteOptoutImplOptOutServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOptoutImplOptOutServiceImplProperties> get serializer => _$ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesSerializer();
}

class _$ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOptoutImplOptOutServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOptoutImplOptOutServiceImplProperties, _$ComAdobeGraniteOptoutImplOptOutServiceImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteOptoutImplOptOutServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.optoutPeriodCookies != null) {
      yield r'optout.cookies';
      yield serializers.serialize(
        object.optoutPeriodCookies,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.optoutPeriodHeaders != null) {
      yield r'optout.headers';
      yield serializers.serialize(
        object.optoutPeriodHeaders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.optoutPeriodWhitelistPeriodCookies != null) {
      yield r'optout.whitelist.cookies';
      yield serializers.serialize(
        object.optoutPeriodWhitelistPeriodCookies,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'optout.cookies':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.optoutPeriodCookies.replace(valueDes);
          break;
        case r'optout.headers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.optoutPeriodHeaders.replace(valueDes);
          break;
        case r'optout.whitelist.cookies':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.optoutPeriodWhitelistPeriodCookies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOptoutImplOptOutServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder();
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

