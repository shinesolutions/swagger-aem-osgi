//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties.g.dart';

/// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
///
/// Properties:
/// * [commitsTrackerWriterGroups] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties implements Built<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'commitsTrackerWriterGroups')
  ConfigNodePropertyArray? get commitsTrackerWriterGroups;

  OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties._();

  factory OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties([void updates(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties> get serializer => _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties, _$OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.commitsTrackerWriterGroups != null) {
      yield r'commitsTrackerWriterGroups';
      yield serializers.serialize(
        object.commitsTrackerWriterGroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'commitsTrackerWriterGroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.commitsTrackerWriterGroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder();
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

