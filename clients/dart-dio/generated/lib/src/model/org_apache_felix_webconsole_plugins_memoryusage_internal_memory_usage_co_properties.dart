//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties.g.dart';

/// OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
///
/// Properties:
/// * [felixPeriodMemoryusagePeriodDumpPeriodThreshold] 
/// * [felixPeriodMemoryusagePeriodDumpPeriodInterval] 
/// * [felixPeriodMemoryusagePeriodDumpPeriodLocation] 
@BuiltValue()
abstract class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties implements Built<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder> {
  @BuiltValueField(wireName: r'felix.memoryusage.dump.threshold')
  ConfigNodePropertyInteger? get felixPeriodMemoryusagePeriodDumpPeriodThreshold;

  @BuiltValueField(wireName: r'felix.memoryusage.dump.interval')
  ConfigNodePropertyInteger? get felixPeriodMemoryusagePeriodDumpPeriodInterval;

  @BuiltValueField(wireName: r'felix.memoryusage.dump.location')
  ConfigNodePropertyString? get felixPeriodMemoryusagePeriodDumpPeriodLocation;

  OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties._();

  factory OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties([void updates(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder b)]) = _$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties> get serializer => _$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesSerializer();
}

class _$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties, _$OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties];

  @override
  final String wireName = r'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.felixPeriodMemoryusagePeriodDumpPeriodThreshold != null) {
      yield r'felix.memoryusage.dump.threshold';
      yield serializers.serialize(
        object.felixPeriodMemoryusagePeriodDumpPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.felixPeriodMemoryusagePeriodDumpPeriodInterval != null) {
      yield r'felix.memoryusage.dump.interval';
      yield serializers.serialize(
        object.felixPeriodMemoryusagePeriodDumpPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.felixPeriodMemoryusagePeriodDumpPeriodLocation != null) {
      yield r'felix.memoryusage.dump.location';
      yield serializers.serialize(
        object.felixPeriodMemoryusagePeriodDumpPeriodLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'felix.memoryusage.dump.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.felixPeriodMemoryusagePeriodDumpPeriodThreshold.replace(valueDes);
          break;
        case r'felix.memoryusage.dump.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.felixPeriodMemoryusagePeriodDumpPeriodInterval.replace(valueDes);
          break;
        case r'felix.memoryusage.dump.location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.felixPeriodMemoryusagePeriodDumpPeriodLocation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesBuilder();
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

