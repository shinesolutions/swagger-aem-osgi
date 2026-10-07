//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties.g.dart';

/// OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [schedulerPeriodConcurrent] 
/// * [chunkPeriodCleanupPeriodAge] 
@BuiltValue()
abstract class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties implements Built<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'scheduler.concurrent')
  ConfigNodePropertyBoolean? get schedulerPeriodConcurrent;

  @BuiltValueField(wireName: r'chunk.cleanup.age')
  ConfigNodePropertyInteger? get chunkPeriodCleanupPeriodAge;

  OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties._();

  factory OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties([void updates(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder b)]) = _$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties> get serializer => _$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesSerializer();
}

class _$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties, _$OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties];

  @override
  final String wireName = r'OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.schedulerPeriodConcurrent != null) {
      yield r'scheduler.concurrent';
      yield serializers.serialize(
        object.schedulerPeriodConcurrent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.chunkPeriodCleanupPeriodAge != null) {
      yield r'chunk.cleanup.age';
      yield serializers.serialize(
        object.chunkPeriodCleanupPeriodAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'scheduler.concurrent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.schedulerPeriodConcurrent.replace(valueDes);
          break;
        case r'chunk.cleanup.age':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.chunkPeriodCleanupPeriodAge.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesBuilder();
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

