//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties.g.dart';

/// ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
///
/// Properties:
/// * [compatgroups] 
/// * [enabled] 
@BuiltValue()
abstract class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties implements Built<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'compatgroups')
  ConfigNodePropertyArray? get compatgroups;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties._();

  factory ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties([void updates(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder b)]) = _$ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties> get serializer => _$ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesSerializer();
}

class _$ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties, _$ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.compatgroups != null) {
      yield r'compatgroups';
      yield serializers.serialize(
        object.compatgroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'compatgroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.compatgroups.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesBuilder();
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

