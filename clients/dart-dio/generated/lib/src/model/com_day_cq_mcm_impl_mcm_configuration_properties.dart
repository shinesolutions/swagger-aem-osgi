//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mcm_impl_mcm_configuration_properties.g.dart';

/// ComDayCqMcmImplMCMConfigurationProperties
///
/// Properties:
/// * [experiencePeriodIndirection] 
/// * [touchpointPeriodIndirection] 
@BuiltValue()
abstract class ComDayCqMcmImplMCMConfigurationProperties implements Built<ComDayCqMcmImplMCMConfigurationProperties, ComDayCqMcmImplMCMConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'experience.indirection')
  ConfigNodePropertyArray? get experiencePeriodIndirection;

  @BuiltValueField(wireName: r'touchpoint.indirection')
  ConfigNodePropertyArray? get touchpointPeriodIndirection;

  ComDayCqMcmImplMCMConfigurationProperties._();

  factory ComDayCqMcmImplMCMConfigurationProperties([void updates(ComDayCqMcmImplMCMConfigurationPropertiesBuilder b)]) = _$ComDayCqMcmImplMCMConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMcmImplMCMConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMcmImplMCMConfigurationProperties> get serializer => _$ComDayCqMcmImplMCMConfigurationPropertiesSerializer();
}

class _$ComDayCqMcmImplMCMConfigurationPropertiesSerializer implements PrimitiveSerializer<ComDayCqMcmImplMCMConfigurationProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMcmImplMCMConfigurationProperties, _$ComDayCqMcmImplMCMConfigurationProperties];

  @override
  final String wireName = r'ComDayCqMcmImplMCMConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMcmImplMCMConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.experiencePeriodIndirection != null) {
      yield r'experience.indirection';
      yield serializers.serialize(
        object.experiencePeriodIndirection,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.touchpointPeriodIndirection != null) {
      yield r'touchpoint.indirection';
      yield serializers.serialize(
        object.touchpointPeriodIndirection,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMcmImplMCMConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMcmImplMCMConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'experience.indirection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.experiencePeriodIndirection.replace(valueDes);
          break;
        case r'touchpoint.indirection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.touchpointPeriodIndirection.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMcmImplMCMConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMcmImplMCMConfigurationPropertiesBuilder();
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

