//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties.g.dart';

/// OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
///
/// Properties:
/// * [extensions] 
/// * [minDurationMs] 
/// * [maxDurationMs] 
/// * [compactLogFormat] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties implements Built<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'extensions')
  ConfigNodePropertyArray? get extensions;

  @BuiltValueField(wireName: r'minDurationMs')
  ConfigNodePropertyInteger? get minDurationMs;

  @BuiltValueField(wireName: r'maxDurationMs')
  ConfigNodePropertyInteger? get maxDurationMs;

  @BuiltValueField(wireName: r'compactLogFormat')
  ConfigNodePropertyBoolean? get compactLogFormat;

  OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties._();

  factory OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties([void updates(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder b)]) = _$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties> get serializer => _$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesSerializer();
}

class _$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties, _$OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.extensions != null) {
      yield r'extensions';
      yield serializers.serialize(
        object.extensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.minDurationMs != null) {
      yield r'minDurationMs';
      yield serializers.serialize(
        object.minDurationMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxDurationMs != null) {
      yield r'maxDurationMs';
      yield serializers.serialize(
        object.maxDurationMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.compactLogFormat != null) {
      yield r'compactLogFormat';
      yield serializers.serialize(
        object.compactLogFormat,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.extensions.replace(valueDes);
          break;
        case r'minDurationMs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minDurationMs.replace(valueDes);
          break;
        case r'maxDurationMs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxDurationMs.replace(valueDes);
          break;
        case r'compactLogFormat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.compactLogFormat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder();
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

