//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_compatrouter_impl_routing_config_properties.g.dart';

/// ComAdobeGraniteCompatrouterImplRoutingConfigProperties
///
/// Properties:
/// * [id] 
/// * [compatPath] 
/// * [newPath] 
@BuiltValue()
abstract class ComAdobeGraniteCompatrouterImplRoutingConfigProperties implements Built<ComAdobeGraniteCompatrouterImplRoutingConfigProperties, ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'id')
  ConfigNodePropertyString? get id;

  @BuiltValueField(wireName: r'compatPath')
  ConfigNodePropertyString? get compatPath;

  @BuiltValueField(wireName: r'newPath')
  ConfigNodePropertyString? get newPath;

  ComAdobeGraniteCompatrouterImplRoutingConfigProperties._();

  factory ComAdobeGraniteCompatrouterImplRoutingConfigProperties([void updates(ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder b)]) = _$ComAdobeGraniteCompatrouterImplRoutingConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCompatrouterImplRoutingConfigProperties> get serializer => _$ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesSerializer();
}

class _$ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCompatrouterImplRoutingConfigProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCompatrouterImplRoutingConfigProperties, _$ComAdobeGraniteCompatrouterImplRoutingConfigProperties];

  @override
  final String wireName = r'ComAdobeGraniteCompatrouterImplRoutingConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.compatPath != null) {
      yield r'compatPath';
      yield serializers.serialize(
        object.compatPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.newPath != null) {
      yield r'newPath';
      yield serializers.serialize(
        object.newPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.id.replace(valueDes);
          break;
        case r'compatPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.compatPath.replace(valueDes);
          break;
        case r'newPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.newPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCompatrouterImplRoutingConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCompatrouterImplRoutingConfigPropertiesBuilder();
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

