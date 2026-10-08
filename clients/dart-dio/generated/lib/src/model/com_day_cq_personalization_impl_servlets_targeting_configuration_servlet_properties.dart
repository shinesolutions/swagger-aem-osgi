//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties.g.dart';

/// ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
///
/// Properties:
/// * [forcelocation] 
@BuiltValue()
abstract class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties implements Built<ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties, ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'forcelocation')
  ConfigNodePropertyBoolean? get forcelocation;

  ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties._();

  factory ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties([void updates(ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder b)]) = _$ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties> get serializer => _$ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesSerializer();
}

class _$ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties, _$ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties];

  @override
  final String wireName = r'ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.forcelocation != null) {
      yield r'forcelocation';
      yield serializers.serialize(
        object.forcelocation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'forcelocation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.forcelocation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesBuilder();
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

