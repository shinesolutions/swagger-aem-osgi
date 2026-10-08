//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_replicator_impl_properties.g.dart';

/// ComDayCqReplicationImplReplicatorImplProperties
///
/// Properties:
/// * [distributeEvents] 
@BuiltValue()
abstract class ComDayCqReplicationImplReplicatorImplProperties implements Built<ComDayCqReplicationImplReplicatorImplProperties, ComDayCqReplicationImplReplicatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'distribute_events')
  ConfigNodePropertyBoolean? get distributeEvents;

  ComDayCqReplicationImplReplicatorImplProperties._();

  factory ComDayCqReplicationImplReplicatorImplProperties([void updates(ComDayCqReplicationImplReplicatorImplPropertiesBuilder b)]) = _$ComDayCqReplicationImplReplicatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplReplicatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplReplicatorImplProperties> get serializer => _$ComDayCqReplicationImplReplicatorImplPropertiesSerializer();
}

class _$ComDayCqReplicationImplReplicatorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplReplicatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplReplicatorImplProperties, _$ComDayCqReplicationImplReplicatorImplProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplReplicatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplReplicatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.distributeEvents != null) {
      yield r'distribute_events';
      yield serializers.serialize(
        object.distributeEvents,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplReplicatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplReplicatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'distribute_events':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.distributeEvents.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplReplicatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplReplicatorImplPropertiesBuilder();
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

