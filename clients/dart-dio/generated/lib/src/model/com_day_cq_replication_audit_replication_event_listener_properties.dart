//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_audit_replication_event_listener_properties.g.dart';

/// ComDayCqReplicationAuditReplicationEventListenerProperties
///
/// Properties:
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class ComDayCqReplicationAuditReplicationEventListenerProperties implements Built<ComDayCqReplicationAuditReplicationEventListenerProperties, ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  ComDayCqReplicationAuditReplicationEventListenerProperties._();

  factory ComDayCqReplicationAuditReplicationEventListenerProperties([void updates(ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder b)]) = _$ComDayCqReplicationAuditReplicationEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationAuditReplicationEventListenerProperties> get serializer => _$ComDayCqReplicationAuditReplicationEventListenerPropertiesSerializer();
}

class _$ComDayCqReplicationAuditReplicationEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationAuditReplicationEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationAuditReplicationEventListenerProperties, _$ComDayCqReplicationAuditReplicationEventListenerProperties];

  @override
  final String wireName = r'ComDayCqReplicationAuditReplicationEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationAuditReplicationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationAuditReplicationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationAuditReplicationEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationAuditReplicationEventListenerPropertiesBuilder();
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

