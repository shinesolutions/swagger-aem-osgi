//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_compatrouter_impl_switch_mapping_config_properties.g.dart';

/// ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
///
/// Properties:
/// * [group] 
/// * [ids] 
@BuiltValue()
abstract class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties implements Built<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties, ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'group')
  ConfigNodePropertyString? get group;

  @BuiltValueField(wireName: r'ids')
  ConfigNodePropertyArray? get ids;

  ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties._();

  factory ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties([void updates(ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder b)]) = _$ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties> get serializer => _$ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesSerializer();
}

class _$ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties, _$ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties];

  @override
  final String wireName = r'ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.group != null) {
      yield r'group';
      yield serializers.serialize(
        object.group,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.ids != null) {
      yield r'ids';
      yield serializers.serialize(
        object.ids,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.group.replace(valueDes);
          break;
        case r'ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ids.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder();
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

