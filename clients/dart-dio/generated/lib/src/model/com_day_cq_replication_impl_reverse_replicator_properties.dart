//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_reverse_replicator_properties.g.dart';

/// ComDayCqReplicationImplReverseReplicatorProperties
///
/// Properties:
/// * [schedulerPeriodPeriod] 
@BuiltValue()
abstract class ComDayCqReplicationImplReverseReplicatorProperties implements Built<ComDayCqReplicationImplReverseReplicatorProperties, ComDayCqReplicationImplReverseReplicatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.period')
  ConfigNodePropertyInteger? get schedulerPeriodPeriod;

  ComDayCqReplicationImplReverseReplicatorProperties._();

  factory ComDayCqReplicationImplReverseReplicatorProperties([void updates(ComDayCqReplicationImplReverseReplicatorPropertiesBuilder b)]) = _$ComDayCqReplicationImplReverseReplicatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplReverseReplicatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplReverseReplicatorProperties> get serializer => _$ComDayCqReplicationImplReverseReplicatorPropertiesSerializer();
}

class _$ComDayCqReplicationImplReverseReplicatorPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplReverseReplicatorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplReverseReplicatorProperties, _$ComDayCqReplicationImplReverseReplicatorProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplReverseReplicatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplReverseReplicatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodPeriod != null) {
      yield r'scheduler.period';
      yield serializers.serialize(
        object.schedulerPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplReverseReplicatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplReverseReplicatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.schedulerPeriodPeriod.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplReverseReplicatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplReverseReplicatorPropertiesBuilder();
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

