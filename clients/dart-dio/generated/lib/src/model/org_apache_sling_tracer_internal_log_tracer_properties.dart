//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_tracer_internal_log_tracer_properties.g.dart';

/// OrgApacheSlingTracerInternalLogTracerProperties
///
/// Properties:
/// * [tracerSets] 
/// * [enabled] 
/// * [servletEnabled] 
/// * [recordingCacheSizeInMB] 
/// * [recordingCacheDurationInSecs] 
/// * [recordingCompressionEnabled] 
/// * [gzipResponse] 
@BuiltValue()
abstract class OrgApacheSlingTracerInternalLogTracerProperties implements Built<OrgApacheSlingTracerInternalLogTracerProperties, OrgApacheSlingTracerInternalLogTracerPropertiesBuilder> {
  @BuiltValueField(wireName: r'tracerSets')
  ConfigNodePropertyArray? get tracerSets;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'servletEnabled')
  ConfigNodePropertyBoolean? get servletEnabled;

  @BuiltValueField(wireName: r'recordingCacheSizeInMB')
  ConfigNodePropertyInteger? get recordingCacheSizeInMB;

  @BuiltValueField(wireName: r'recordingCacheDurationInSecs')
  ConfigNodePropertyInteger? get recordingCacheDurationInSecs;

  @BuiltValueField(wireName: r'recordingCompressionEnabled')
  ConfigNodePropertyBoolean? get recordingCompressionEnabled;

  @BuiltValueField(wireName: r'gzipResponse')
  ConfigNodePropertyBoolean? get gzipResponse;

  OrgApacheSlingTracerInternalLogTracerProperties._();

  factory OrgApacheSlingTracerInternalLogTracerProperties([void updates(OrgApacheSlingTracerInternalLogTracerPropertiesBuilder b)]) = _$OrgApacheSlingTracerInternalLogTracerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingTracerInternalLogTracerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingTracerInternalLogTracerProperties> get serializer => _$OrgApacheSlingTracerInternalLogTracerPropertiesSerializer();
}

class _$OrgApacheSlingTracerInternalLogTracerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingTracerInternalLogTracerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingTracerInternalLogTracerProperties, _$OrgApacheSlingTracerInternalLogTracerProperties];

  @override
  final String wireName = r'OrgApacheSlingTracerInternalLogTracerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingTracerInternalLogTracerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.tracerSets != null) {
      yield r'tracerSets';
      yield serializers.serialize(
        object.tracerSets,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servletEnabled != null) {
      yield r'servletEnabled';
      yield serializers.serialize(
        object.servletEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.recordingCacheSizeInMB != null) {
      yield r'recordingCacheSizeInMB';
      yield serializers.serialize(
        object.recordingCacheSizeInMB,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.recordingCacheDurationInSecs != null) {
      yield r'recordingCacheDurationInSecs';
      yield serializers.serialize(
        object.recordingCacheDurationInSecs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.recordingCompressionEnabled != null) {
      yield r'recordingCompressionEnabled';
      yield serializers.serialize(
        object.recordingCompressionEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.gzipResponse != null) {
      yield r'gzipResponse';
      yield serializers.serialize(
        object.gzipResponse,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingTracerInternalLogTracerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingTracerInternalLogTracerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tracerSets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.tracerSets.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'servletEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.servletEnabled.replace(valueDes);
          break;
        case r'recordingCacheSizeInMB':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.recordingCacheSizeInMB.replace(valueDes);
          break;
        case r'recordingCacheDurationInSecs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.recordingCacheDurationInSecs.replace(valueDes);
          break;
        case r'recordingCompressionEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.recordingCompressionEnabled.replace(valueDes);
          break;
        case r'gzipResponse':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.gzipResponse.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingTracerInternalLogTracerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingTracerInternalLogTracerPropertiesBuilder();
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

