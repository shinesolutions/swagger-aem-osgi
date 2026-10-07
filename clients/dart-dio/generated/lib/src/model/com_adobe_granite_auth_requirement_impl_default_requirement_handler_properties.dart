//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties.g.dart';

/// ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
///
/// Properties:
/// * [supportedPaths] 
@BuiltValue()
abstract class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties implements Built<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'supportedPaths')
  ConfigNodePropertyArray? get supportedPaths;

  ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties._();

  factory ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties([void updates(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties> get serializer => _$ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties, _$ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.supportedPaths != null) {
      yield r'supportedPaths';
      yield serializers.serialize(
        object.supportedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'supportedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.supportedPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder();
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

