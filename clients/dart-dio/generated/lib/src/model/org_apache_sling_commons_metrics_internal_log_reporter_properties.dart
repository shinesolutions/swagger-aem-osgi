//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_metrics_internal_log_reporter_properties.g.dart';

/// OrgApacheSlingCommonsMetricsInternalLogReporterProperties
///
/// Properties:
/// * [period] 
/// * [timeUnit] 
/// * [level] 
/// * [loggerName] 
/// * [prefix] 
/// * [pattern] 
/// * [registryName] 
@BuiltValue()
abstract class OrgApacheSlingCommonsMetricsInternalLogReporterProperties implements Built<OrgApacheSlingCommonsMetricsInternalLogReporterProperties, OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'period')
  ConfigNodePropertyInteger? get period;

  @BuiltValueField(wireName: r'timeUnit')
  ConfigNodePropertyDropDown? get timeUnit;

  @BuiltValueField(wireName: r'level')
  ConfigNodePropertyDropDown? get level;

  @BuiltValueField(wireName: r'loggerName')
  ConfigNodePropertyString? get loggerName;

  @BuiltValueField(wireName: r'prefix')
  ConfigNodePropertyString? get prefix;

  @BuiltValueField(wireName: r'pattern')
  ConfigNodePropertyString? get pattern;

  @BuiltValueField(wireName: r'registryName')
  ConfigNodePropertyString? get registryName;

  OrgApacheSlingCommonsMetricsInternalLogReporterProperties._();

  factory OrgApacheSlingCommonsMetricsInternalLogReporterProperties([void updates(OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder b)]) = _$OrgApacheSlingCommonsMetricsInternalLogReporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsMetricsInternalLogReporterProperties> get serializer => _$OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesSerializer();
}

class _$OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsMetricsInternalLogReporterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsMetricsInternalLogReporterProperties, _$OrgApacheSlingCommonsMetricsInternalLogReporterProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsMetricsInternalLogReporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.period != null) {
      yield r'period';
      yield serializers.serialize(
        object.period,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.timeUnit != null) {
      yield r'timeUnit';
      yield serializers.serialize(
        object.timeUnit,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.level != null) {
      yield r'level';
      yield serializers.serialize(
        object.level,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.loggerName != null) {
      yield r'loggerName';
      yield serializers.serialize(
        object.loggerName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.prefix != null) {
      yield r'prefix';
      yield serializers.serialize(
        object.prefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pattern != null) {
      yield r'pattern';
      yield serializers.serialize(
        object.pattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.registryName != null) {
      yield r'registryName';
      yield serializers.serialize(
        object.registryName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.period.replace(valueDes);
          break;
        case r'timeUnit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.timeUnit.replace(valueDes);
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.level.replace(valueDes);
          break;
        case r'loggerName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.loggerName.replace(valueDes);
          break;
        case r'prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.prefix.replace(valueDes);
          break;
        case r'pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pattern.replace(valueDes);
          break;
        case r'registryName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.registryName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsMetricsInternalLogReporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsMetricsInternalLogReporterPropertiesBuilder();
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

