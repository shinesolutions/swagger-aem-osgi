//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_resourcestatus_impl_composite_status_type_properties.g.dart';

/// ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
///
/// Properties:
/// * [name] 
/// * [types] 
@BuiltValue()
abstract class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties implements Built<ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties, ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'types')
  ConfigNodePropertyArray? get types;

  ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties._();

  factory ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties([void updates(ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder b)]) = _$ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties> get serializer => _$ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesSerializer();
}

class _$ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties, _$ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties];

  @override
  final String wireName = r'ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.types != null) {
      yield r'types';
      yield serializers.serialize(
        object.types,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder result,
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
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.types.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesBuilder();
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

