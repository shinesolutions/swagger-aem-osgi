//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_system_ready_monitor_properties.g.dart';

/// OrgApacheFelixSystemreadySystemReadyMonitorProperties
///
/// Properties:
/// * [pollPeriodInterval] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadySystemReadyMonitorProperties implements Built<OrgApacheFelixSystemreadySystemReadyMonitorProperties, OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder> {
  @BuiltValueField(wireName: r'poll.interval')
  ConfigNodePropertyInteger? get pollPeriodInterval;

  OrgApacheFelixSystemreadySystemReadyMonitorProperties._();

  factory OrgApacheFelixSystemreadySystemReadyMonitorProperties([void updates(OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadySystemReadyMonitorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadySystemReadyMonitorProperties> get serializer => _$OrgApacheFelixSystemreadySystemReadyMonitorPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadySystemReadyMonitorPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadySystemReadyMonitorProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadySystemReadyMonitorProperties, _$OrgApacheFelixSystemreadySystemReadyMonitorProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadySystemReadyMonitorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadySystemReadyMonitorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pollPeriodInterval != null) {
      yield r'poll.interval';
      yield serializers.serialize(
        object.pollPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixSystemreadySystemReadyMonitorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'poll.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.pollPeriodInterval.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixSystemreadySystemReadyMonitorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadySystemReadyMonitorPropertiesBuilder();
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

