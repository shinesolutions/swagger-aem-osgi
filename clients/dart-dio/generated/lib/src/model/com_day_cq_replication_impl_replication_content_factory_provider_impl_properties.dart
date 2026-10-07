//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_replication_content_factory_provider_impl_properties.g.dart';

/// ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
///
/// Properties:
/// * [replicationPeriodContentPeriodUseFileStorage] 
/// * [replicationPeriodContentPeriodMaxCommitAttempts] 
@BuiltValue()
abstract class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties implements Built<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties, ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'replication.content.useFileStorage')
  ConfigNodePropertyBoolean? get replicationPeriodContentPeriodUseFileStorage;

  @BuiltValueField(wireName: r'replication.content.maxCommitAttempts')
  ConfigNodePropertyInteger? get replicationPeriodContentPeriodMaxCommitAttempts;

  ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties._();

  factory ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties([void updates(ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder b)]) = _$ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties> get serializer => _$ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesSerializer();
}

class _$ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties, _$ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.replicationPeriodContentPeriodUseFileStorage != null) {
      yield r'replication.content.useFileStorage';
      yield serializers.serialize(
        object.replicationPeriodContentPeriodUseFileStorage,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.replicationPeriodContentPeriodMaxCommitAttempts != null) {
      yield r'replication.content.maxCommitAttempts';
      yield serializers.serialize(
        object.replicationPeriodContentPeriodMaxCommitAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'replication.content.useFileStorage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.replicationPeriodContentPeriodUseFileStorage.replace(valueDes);
          break;
        case r'replication.content.maxCommitAttempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.replicationPeriodContentPeriodMaxCommitAttempts.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder();
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

