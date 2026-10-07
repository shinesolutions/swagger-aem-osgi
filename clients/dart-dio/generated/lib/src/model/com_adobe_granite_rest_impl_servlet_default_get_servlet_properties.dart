//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_rest_impl_servlet_default_get_servlet_properties.g.dart';

/// ComAdobeGraniteRestImplServletDefaultGETServletProperties
///
/// Properties:
/// * [defaultPeriodLimit] 
/// * [usePeriodAbsolutePeriodUri] 
@BuiltValue()
abstract class ComAdobeGraniteRestImplServletDefaultGETServletProperties implements Built<ComAdobeGraniteRestImplServletDefaultGETServletProperties, ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.limit')
  ConfigNodePropertyInteger? get defaultPeriodLimit;

  @BuiltValueField(wireName: r'use.absolute.uri')
  ConfigNodePropertyBoolean? get usePeriodAbsolutePeriodUri;

  ComAdobeGraniteRestImplServletDefaultGETServletProperties._();

  factory ComAdobeGraniteRestImplServletDefaultGETServletProperties([void updates(ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder b)]) = _$ComAdobeGraniteRestImplServletDefaultGETServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRestImplServletDefaultGETServletProperties> get serializer => _$ComAdobeGraniteRestImplServletDefaultGETServletPropertiesSerializer();
}

class _$ComAdobeGraniteRestImplServletDefaultGETServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRestImplServletDefaultGETServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRestImplServletDefaultGETServletProperties, _$ComAdobeGraniteRestImplServletDefaultGETServletProperties];

  @override
  final String wireName = r'ComAdobeGraniteRestImplServletDefaultGETServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRestImplServletDefaultGETServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultPeriodLimit != null) {
      yield r'default.limit';
      yield serializers.serialize(
        object.defaultPeriodLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.usePeriodAbsolutePeriodUri != null) {
      yield r'use.absolute.uri';
      yield serializers.serialize(
        object.usePeriodAbsolutePeriodUri,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRestImplServletDefaultGETServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default.limit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.defaultPeriodLimit.replace(valueDes);
          break;
        case r'use.absolute.uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.usePeriodAbsolutePeriodUri.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRestImplServletDefaultGETServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder();
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

